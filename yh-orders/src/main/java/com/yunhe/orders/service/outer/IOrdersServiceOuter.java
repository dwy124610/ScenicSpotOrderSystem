package com.yunhe.orders.service.outer;

import com.yunhe.common.exception.TicketNotEnoughException;
import com.yunhe.common.model.domain.Orders;

import java.util.List;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 16:00
 */
public interface IOrdersServiceOuter {

    Orders submitOrder(String username , String scenicSpotName , int adultTicketAccount , int childTicketAccount , String paymentMethod) throws TicketNotEnoughException;

    Orders payOrder(Orders order);

    Orders useOrder(Orders orders);

    List<Orders> showHistoryOrders(String username);
}
