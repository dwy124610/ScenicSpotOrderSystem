package com.yunhe.orders.service.inner.impl;

import com.yunhe.orders.service.inner.IOrdersServiceInner;
import com.yunhe.common.mapper.OrdersMapper;
import com.yunhe.common.model.domain.Orders;
import com.yunhe.common.model.domain.OrdersKey;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 11:22
 */
@Service
@Slf4j
public class OrdersServiceInnerImplInner implements IOrdersServiceInner {

    @Resource
    OrdersMapper ordersMapper;
    @Override
    public Orders addOrder(Orders order) {
        ordersMapper.insert(order);
        return order;
    }

    @Override
    public int deleteOrderByOrderId(String orderId) {
        log.info("删除订单号为:"+orderId+"的订单");
        OrdersKey ordersKey = new OrdersKey();
        ordersKey.setOrderId(orderId);
        return ordersMapper.deleteByPrimaryKey(ordersKey);
    }

    @Override
    public Orders selectOrdersByOrderId(String orderId) {
        OrdersKey ordersKey = new OrdersKey();
        ordersKey.setOrderId(orderId);
        return ordersMapper.selectByPrimaryKey(ordersKey);
    }

    @Override
    public Orders updateUser(Orders order) {
        ordersMapper.updateByPrimaryKey(order);
        return order;
    }
}
