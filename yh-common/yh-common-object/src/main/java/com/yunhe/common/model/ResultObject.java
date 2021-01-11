package com.yunhe.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/9 17:46
 */
@ResponseBody
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResultObject<T> {
    //操作结果对象
    //如果只有一个值，如通过id获取对象，则为对象Object，如果可能有多个值，如查询，结果是个Iterable，如果带分页，则为Page
    private T results;
    private int errorCode;
    //错误消息，没有错误的话，为空
    private String errorMsg;

    public ResultObject(T results) {
            this.results = results;
    }

    public ResultObject(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}

