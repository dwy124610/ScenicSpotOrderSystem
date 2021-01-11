package com.yunhe.orders.service.inner;

import com.yunhe.common.model.domain.Orders;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 11:29
 */
public interface IOrdersServiceInner {

    Orders addOrder(Orders order);

    int deleteOrderByOrderId(String orderId);

    Orders selectOrdersByOrderId(String orderId);

    Orders updateUser(Orders order);
}
