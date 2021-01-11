package com.yunhe.tickets.controller;

import com.yunhe.common.model.ResultObject;
import com.yunhe.common.model.domain.Tickets;
import com.yunhe.tickets.service.inner.ITicketsServiceInner;
import com.yunhe.tickets.service.outer.ITicketsServiceOuter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 10:54
 */
@Api(value = "tickets" , description = "票务维护")
@RestController
@RequestMapping("/tickets")
public class TicketsController {

    @Resource
    ITicketsServiceInner ticketsServiceInner;

    @Resource
    ITicketsServiceOuter ticketsServiceOuter;

    @ApiOperation("增加票")
    @PostMapping("/add")
    public ResponseEntity<ResultObject> addTicket(@RequestBody Tickets ticket){
        Tickets results = ticketsServiceInner.addTicket(ticket);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("删除该景点的票")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "scenicSpotName" , value = "景区名字" , dataType = "String" , paramType = "query")
    })
    @DeleteMapping("/delete")
    public ResponseEntity<ResultObject> deleteTicket(@RequestParam String scenicSpotName){
        ticketsServiceInner.deleteTicketByScenicSpotName(scenicSpotName);
        return new ResponseEntity<>(new ResultObject<>(null), HttpStatus.OK);
    }

    @ApiOperation("查找该景点的票")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "scenicSpotName" , value = "景区名字" , dataType = "String" , paramType = "query")
    })
    @GetMapping("/remainingTickets")
    public ResponseEntity<ResultObject> showRemainingTicketCount(@RequestParam String scenicSpotName){
        int results = ticketsServiceOuter.showRemainingTicketCount(scenicSpotName);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("更新票")
    @PutMapping("/update")
    public ResponseEntity<ResultObject> updateTicket(@RequestBody Tickets ticket){
        Tickets results = ticketsServiceInner.updateTicket(ticket);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("查找该景点的剩余票")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "scenicSpotName" , value = "景区名字" , dataType = "String" , paramType = "query")
    })
    @GetMapping("/select")
    public ResponseEntity<ResultObject> selectTicketByScenicSpotName(@RequestParam String scenicSpotName){
        Tickets results = ticketsServiceInner.selectUserByScenicSpotName(scenicSpotName);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }
}
