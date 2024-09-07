package me.zzy.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BusinessExceptionCodeMsg {
    INVALID_CODE(10000, "验证码无效"),
    USERNAME_NOT_EXISTS(10001, "用户名不存在"),
    USER_CREDIT_NOT_ENOUTH(10002, "用户积分不足");

    private final int code;
    private final String msg;

}
