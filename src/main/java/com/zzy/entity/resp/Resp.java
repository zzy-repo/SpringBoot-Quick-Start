package com.zzy.entity.resp;

import com.zzy.exception.BusinessException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Resp<T> {
    private Integer RespCode;
    private String RespMsg;
    private T RespData;

    public static final Resp<Void> SUCCESS = success(null);

    public static <T> Resp<T> success(T RespData) {
        return Resp.<T>builder()
                .RespCode(200)
                .RespMsg("success")
                .RespData(RespData)
                .build();
    }

    public static <T> Resp<T> success(String RespMsg, T RespData) {
        return Resp.<T>builder()
                .RespCode(200)
                .RespMsg(RespMsg)
                .RespData(RespData)
                .build();
    }

    public static <T> Resp<T> fail(Integer RespCode,String RespMsg) {
        return Resp.<T>builder()
                .RespCode(RespCode)
                .RespMsg(RespMsg)
                .build();
    }

    public static <T> Resp<T> fail(BusinessException businessException) {
        return Resp.<T>builder()
                .RespCode(businessException.getExceptionCode())
                .RespMsg(businessException.getExceptionMsg())
                .build();
    }
}
