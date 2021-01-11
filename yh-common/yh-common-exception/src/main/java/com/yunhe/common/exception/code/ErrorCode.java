package com.yunhe.common.exception.code;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 16:16
 */
public class ErrorCode {
    // 错误代码
    public enum CODE {
        RUNTIME_EXCEPTION(1, "系统运行错误"),
        REQUIRED_PARAMETER_MISSING(2, "请求参数丢失"),
        METHOD_ARGUMENT_NOTVALID(3, "参数不合法"),
        ARGUMENT_ERROR(4, "参数异常"),
        DATABASE_PROCESS(5, "数据库操作异常"),
        UNIQUE_CONSTRAINTS(6, "唯一性约束"),
        OBJECT_NOTFOUND(7, "对象未找到"),
        USERNAME_PASSWORD_ERROR(8, "用户名密码错误"),
        LOGIN_EXPIRE(9, "登录过期"),
        HYSTRIX_ERROR(10, "网关熔断"),
        TICKET_NOT_ENOUGH_ERROR(11,"票余量不足");
        private int value;
        private String title;
        CODE(int value, String title) {
            this.value = value;
            this.title = title;
        }
        public int value() {
            return value;
        }
        public String title() {
            return title;
        }
    }
}
