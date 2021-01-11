package com.yunhe.tickets.service.outer.impl;

import com.yunhe.common.mapper.TicketsMapper;
import com.yunhe.common.model.domain.TicketsKey;
import com.yunhe.tickets.service.outer.ITicketsServiceOuter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 15:48
 */
@Service
@Slf4j
public class TicketServiceImplOuter implements ITicketsServiceOuter {

    @Resource
    TicketsMapper ticketsMapper;

    @Override
    public int showRemainingTicketCount(String scenicSpotName) {
        TicketsKey ticketsKey = new TicketsKey();
        ticketsKey.setScenicSpotName(scenicSpotName);
        return ticketsMapper.selectByPrimaryKey(ticketsKey).getRemainingTickets();
    }
}
