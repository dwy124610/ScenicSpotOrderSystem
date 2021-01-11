package com.yunhe.tickets.service.inner.impl;

import com.yunhe.common.mapper.TicketsMapper;
import com.yunhe.common.model.domain.Tickets;
import com.yunhe.common.model.domain.TicketsKey;
import com.yunhe.tickets.service.inner.ITicketsServiceInner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 10:50
 */
@Service
@Slf4j
public class TicketsServiceInnerImplInner implements ITicketsServiceInner {

    @Resource
    TicketsMapper ticketsMapper;
    @Override
    public Tickets addTicket(Tickets ticket) {
        ticketsMapper.insert(ticket);
        return ticket;
    }

    @Override
    public int deleteTicketByScenicSpotName(String scenicSpotName) {
        log.info("删除"+scenicSpotName+"的票");
        TicketsKey ticketsKey = new TicketsKey();
        ticketsKey.setScenicSpotName(scenicSpotName);
        return ticketsMapper.deleteByPrimaryKey(ticketsKey);
    }

    @Override
    public Tickets selectUserByScenicSpotName(String scenicSpotName) {
        TicketsKey ticketsKey = new TicketsKey();
        ticketsKey.setScenicSpotName(scenicSpotName);
        return ticketsMapper.selectByPrimaryKey(ticketsKey);
    }

    @Override
    public Tickets updateTicket(Tickets ticket) {
        ticketsMapper.updateByPrimaryKey(ticket);
        return ticket;
    }
}
