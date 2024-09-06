package com.zzy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessException extends RuntimeException {
    private int ExceptionCode = 500;
    private String ExceptionMsg = "服务器异常";

    public BusinessException(BusinessExceptionCodeMsg businessExceptionCodeMsg) {
        super(businessExceptionCodeMsg.getMsg());
        this.ExceptionCode = businessExceptionCodeMsg.getCode();
        this.ExceptionMsg = businessExceptionCodeMsg.getMsg();
    }
}
