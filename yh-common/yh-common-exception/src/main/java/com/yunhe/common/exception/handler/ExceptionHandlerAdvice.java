package com.yunhe.common.exception.handler;

import com.yunhe.common.exception.TicketNotEnoughException;
import com.yunhe.common.exception.code.ErrorCode;
import com.yunhe.common.model.ResultObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 16:17
 */
@ControllerAdvice
@ResponseBody
@Slf4j
public class ExceptionHandlerAdvice {

    @ExceptionHandler(TicketNotEnoughException.class)
    public ResponseEntity<ResultObject> handleException(TicketNotEnoughException e) {
        String tips = "票余数不足";
        return new ResponseEntity<>(
                new ResultObject<>(ErrorCode.CODE.TICKET_NOT_ENOUGH_ERROR.value(), tips),
                HttpStatus.BAD_REQUEST
        );
    }
}
