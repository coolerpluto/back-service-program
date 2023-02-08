package com.fan.back.common.model;

public interface ErrorCode {
    int SUCCESS = 0;  // 成功
    int UNKNOWN_ERROR = -1; // 未知错误
    int PARAM_ERROR = 1000; // 参数错误
    int UNAUTHORIZED_ERROR = 1001; // 未授权
    int COMMON_ERROR = 2000; // 自定义异常处理
}
