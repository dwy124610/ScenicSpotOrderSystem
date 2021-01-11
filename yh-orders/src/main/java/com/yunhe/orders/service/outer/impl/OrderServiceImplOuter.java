package com.yunhe.orders.service.outer.impl;

import com.yunhe.common.exception.TicketNotEnoughException;
import com.yunhe.common.mapper.OrdersMapper;
import com.yunhe.common.mapper.TicketsMapper;
import com.yunhe.common.model.domain.Orders;
import com.yunhe.common.model.domain.OrdersExample;
import com.yunhe.common.model.domain.Tickets;
import com.yunhe.common.model.domain.TicketsKey;
import com.yunhe.orders.service.outer.IOrdersServiceOuter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 16:04
 */
@Service
@Slf4j
public class OrderServiceImplOuter implements IOrdersServiceOuter {

    @Resource
    OrdersMapper ordersMapper;

    @Resource
    TicketsMapper ticketsMapper;

    @Override
    public Orders submitOrder(String username, String scenicSpotName, int adultTicketAccount,
                              int childTicketAccount, String paymentMethod) throws TicketNotEnoughException{
        Orders orders = new Orders();
        TicketsKey ticketsKey = new TicketsKey();
        ticketsKey.setScenicSpotName(scenicSpotName);
        Tickets ticket = ticketsMapper.selectByPrimaryKey(ticketsKey);
        int remainTickets = ticket.getRemainingTickets();
        if (adultTicketAccount + childTicketAccount > remainTickets){
            throw new TicketNotEnoughException("票余量不足");
        }else {
            Double adultTicketPrice = ticket.getAdultTicketPrice();
            Double childTicketPrice = ticket.getChildTicketPrice();
            orders.setOrderTotalPrice(adultTicketPrice*adultTicketAccount+childTicketPrice*childTicketAccount);
        }
        orders.setUsername(username);
        orders.setScenicSpotName(scenicSpotName);
        orders.setAdultTicketsAccont(adultTicketAccount);
        orders.setChildTicketsAccount(childTicketAccount);
        orders.setOrderPaymentMethod(paymentMethod);
        orders.setOrderState(2);
        orders.setOrderId(getOrderIdByTime());
        orders.setCreateTime(new Date(System.currentTimeMillis()));
        ordersMapper.insert(orders);
        return orders;
    }

    @Override
    public Orders payOrder(Orders order) {
        //省略订单支付过程
        order.setOrderState(1);
        //省略生成二维码过程
        ordersMapper.updateByPrimaryKey(order);
        return order;
    }

    @Override
    public Orders useOrder(Orders order) {
        //闸机检验过程
        order.setOrderState(0);
        ordersMapper.updateByPrimaryKey(order);
        return order;
    }

    @Override
    public List<Orders> showHistoryOrders(String username) {
        OrdersExample example = new OrdersExample();
        OrdersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        return ordersMapper.selectByExample(example);
    }

    public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return newDate+result;
    }

}
