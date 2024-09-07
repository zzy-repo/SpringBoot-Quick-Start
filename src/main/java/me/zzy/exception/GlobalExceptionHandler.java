package me.zzy.exception;

import me.zzy.response.Resp;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public <T> Resp<T> exceptionHandler(Exception e){
        if(e instanceof BusinessException){
            return Resp.fail((BusinessException) e);
        }

        return Resp.fail(500,"服务器端异常，请联系管理员");
    }
}