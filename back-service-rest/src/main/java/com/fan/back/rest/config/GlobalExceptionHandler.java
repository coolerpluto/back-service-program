package com.fan.back.rest.config;

import com.fan.back.common.ex.CommonException;
import com.fan.back.common.model.ErrorCode;
import com.fan.back.common.res.ResultBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ConstraintViolationException.class)
    public ResultBody<Map<String, List<String>>> handleValidationException(ConstraintViolationException exception, HttpServletRequest request) {
        Map<String, List<String>> error = Collections.singletonMap("error", (exception.getConstraintViolations())
                .stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.toList()));
        log.warn("URI:[{}],Message:[{}]", request.getRequestURI(), error, exception);
        return ResultBody.fail(ErrorCode.PARAM_ERROR, HttpStatus.BAD_REQUEST.value(), "无效参数", error);
    }


    @ExceptionHandler(BindException.class)
    public ResultBody<Map<String, String>> bindException(BindException exception, HttpServletRequest request) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        Map<String, String> errors = new HashMap<>();
        fieldErrors.forEach(fieldError -> {
            errors.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        log.warn("URI:[{}],Message:[{}]", request.getRequestURI(), errors, exception);
        return ResultBody.fail(ErrorCode.PARAM_ERROR, HttpStatus.BAD_REQUEST.value(), "无效参数", errors);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultBody<Map<String, String>> processValidationError(MethodArgumentNotValidException exception, HttpServletRequest request) {
        BindingResult result = exception.getBindingResult();

        List<FieldError> fieldErrors = result.getFieldErrors();
        Map<String, String> errors = new HashMap<>();
        fieldErrors.forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
        log.warn("URI:[{}],Message:[{}]", request.getRequestURI(), errors, exception);
        return ResultBody.fail(ErrorCode.PARAM_ERROR, HttpStatus.BAD_REQUEST.value(), "无效参数", errors);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResultBody<Void> handleVaildationException(HttpMessageNotReadableException exception, HttpServletRequest request) {
        log.warn("URI:[{}],Message:[{}]", request.getRequestURI(), exception);
        return ResultBody.fail(ErrorCode.PARAM_ERROR, HttpStatus.BAD_REQUEST.value(), "无效参数", null);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResultBody<Void> handleVaildationException(MissingServletRequestParameterException exception, HttpServletRequest request) {
        log.warn("URI:[{}],Message:[{}]", request.getRequestURI(), exception);
        return ResultBody.fail(ErrorCode.PARAM_ERROR, HttpStatus.BAD_REQUEST.value(), "无效参数", null);
    }


    @ExceptionHandler(CommonException.class)
    public ResultBody<Void> handleCommonException(CommonException exception, HttpServletRequest request) {
        log.warn("URI:[{}],Message:[{}]", request.getRequestURI(), exception.getMessage(), exception);
        return ResultBody.fail(exception.getCode(), exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResultBody<Void> handleException(Exception exception, HttpServletRequest request) {
        log.error("URI:[{}],Message:[{}]", request.getRequestURI(), exception.getMessage(), exception);
        return ResultBody.fail(ErrorCode.UNKNOWN_ERROR, "服务器繁忙，请稍后重试");
    }
}




