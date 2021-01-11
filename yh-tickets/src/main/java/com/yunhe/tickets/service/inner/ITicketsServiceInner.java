package com.yunhe.tickets.service.inner;

import com.yunhe.common.model.domain.Tickets;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 10:48
 */
public interface ITicketsServiceInner {

    Tickets addTicket(Tickets ticket);

    int deleteTicketByScenicSpotName(String scenicSpotName);

    Tickets selectUserByScenicSpotName(String scenicSpotName);

    Tickets updateTicket(Tickets ticket);

}
