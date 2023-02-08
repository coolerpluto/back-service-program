package com.fan.back.common.res;

import com.fan.back.common.model.ErrorCode;
import lombok.*;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultBody<T> implements Serializable {
    private int code = ErrorCode.SUCCESS;
    private String message;
    private T result;
    private int httpStatus;
    private Map<String, Object> extra;
    private final long timestamp = System.currentTimeMillis();

    public static <T> ResultBody<T> success() {
        return ResultBody.<T>builder().httpStatus(200).message("success").build();
    }

    public static <T> ResultBody<T> success(int code, String message) {
        return ResultBody.<T>builder().httpStatus(200).code(code).message(message).build();
    }

    public static <T> ResultBody<T> success(int code, String message, T result) {
        return ResultBody.<T>builder().httpStatus(200).code(code).message(message).result(result).build();
    }

    public static <T> ResultBody<T> success(T result) {
        return ResultBody.<T>builder().httpStatus(200).message("success").result(result).build();
    }


    public static <T> ResultBody<T> fail() {
        return ResultBody.<T>builder().httpStatus(500).message("fail").code(ErrorCode.UNKNOWN_ERROR).build();
    }

    public static <T> ResultBody<T> fail(int code, String message) {
        return ResultBody.<T>builder().httpStatus(500).code(code).message(message).build();
    }

    public static <T> ResultBody<T> fail(int code, String message, T result) {
        return ResultBody.<T>builder().httpStatus(500).code(code).message(message).result(result).build();
    }

    public static <T> ResultBody<T> fail(T result) {
        return ResultBody.<T>builder().httpStatus(500).message("fail").code(ErrorCode.UNKNOWN_ERROR).result(result).build();
    }

    public static <T> ResultBody<T> fail(int code,int httpStatus, String message, T result) {
        return ResultBody.<T>builder().httpStatus(500).code(code).message(message).result(result).httpStatus(httpStatus).build();
    }

}
