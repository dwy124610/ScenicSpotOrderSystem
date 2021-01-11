package com.yunhe.orders.controller;

import com.yunhe.common.exception.TicketNotEnoughException;
import com.yunhe.common.model.ResultObject;
import com.yunhe.common.model.domain.Orders;
import com.yunhe.orders.service.inner.IOrdersServiceInner;
import com.yunhe.orders.service.outer.IOrdersServiceOuter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 11:32
 */
@Api(value = "orders" , description = "订单维护")
@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Resource
    IOrdersServiceInner ordersServiceInner;

    @Resource
    IOrdersServiceOuter ordersServiceOuter;

    @ApiOperation("新增订单")
    @PostMapping("/add")
    public ResponseEntity<ResultObject> addOrder(@RequestBody Orders order){
        Orders results = ordersServiceInner.addOrder(order);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("删除订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId" , value = "订单编号" , dataType = "String" , paramType = "query")
    })
    @DeleteMapping("/delete")
    public ResponseEntity<ResultObject> deleteOrder(@RequestParam String orderId){
        ordersServiceInner.deleteOrderByOrderId(orderId);
        return new ResponseEntity<>(new ResultObject<>(null), HttpStatus.OK);
    }

    @ApiOperation("查找订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId" , value = "订单编号" , dataType = "String" , paramType = "query")
    })
    @GetMapping("/select")
    public ResponseEntity<ResultObject> selectOrderByOrderId(@RequestParam String orderId){
        Orders results = ordersServiceInner.selectOrdersByOrderId(orderId);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("更新订单")
    @PutMapping("/update")
    public ResponseEntity<ResultObject> updateOrder(@RequestBody Orders order){
        Orders results = ordersServiceInner.updateUser(order);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("提交订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username" , value = "用户名" , dataType = "String" , paramType = "query"),
            @ApiImplicitParam(name = "scenicSpotName" , value = "景区名" , dataType = "String" , paramType = "query"),
            @ApiImplicitParam(name = "adultTicketAccount" , value = "买成人票的张数" , dataType = "int" , paramType = "query"),
            @ApiImplicitParam(name = "childTicketAccount" , value = "买儿童票的张数" , dataType = "int" , paramType = "query"),
            @ApiImplicitParam(name = "paymentMethod" , value = "支付方式" , dataType = "String" , paramType = "query")

    })
    @PostMapping("/submit")
    public ResponseEntity<ResultObject> submitOrder(@RequestParam String username,
                                                    @RequestParam String scenicSpotName,
                                                    @RequestParam int adultTicketAccount,
                                                    @RequestParam int childTicketAccount,
                                                    @RequestParam String paymentMethod) throws TicketNotEnoughException {
        Orders results = ordersServiceOuter.submitOrder(username,scenicSpotName,adultTicketAccount,childTicketAccount,paymentMethod);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("支付订单")
    @PutMapping("/pay")
    public ResponseEntity<ResultObject> payOrder(@RequestBody Orders order){
        Orders results = ordersServiceOuter.payOrder(order);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("使用订单")
    @PutMapping("/use")
    public ResponseEntity<ResultObject> usrOrder(@RequestBody Orders order){
        Orders results = ordersServiceOuter.useOrder(order);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("查看历史订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username" , value = "用户名" , dataType = "String" , paramType = "query")
    })
    @GetMapping("/history")
    public ResponseEntity<ResultObject> usrOrder(@RequestParam String username){
        List<Orders> results = ordersServiceOuter.showHistoryOrders(username);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }
}
