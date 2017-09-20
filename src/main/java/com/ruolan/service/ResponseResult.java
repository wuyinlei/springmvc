package com.ruolan.service;


import com.ruolan.utils.ResponseErrorEnum;

//@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ResponseResult<T> { 
 
    private boolean success;
 
    private String message;
 
    private T data;
 
    /* 不提供直接设置errorCode的接口，只能通过setErrorInfo方法设置错误信息 */ 
    private String errorCode;
 
    private ResponseResult() { 
    } 
 
    public static <T> ResponseResult<T> newInstance() { 
        return new ResponseResult<>(); 
    } 
 
    public boolean isSuccess() { 
        return success;
    } 
 
    public void setSuccess(boolean success) {
        this.success = success;
    } 
 
    public String getMessage() {
        return message;
    } 
 
    public void setMessage(String message) {
        this.message = message;
    } 
 
    public Object getData() {
        return data;
    } 
 
    public void setData(T data) {
        this.data = data;
    } 
 
    public String getErrorCode() {
        return errorCode;
    } 
 
    // 设置错误信息 
    public void setErrorInfo(ResponseErrorEnum responseErrorEnum) {
        this.errorCode = responseErrorEnum.getCode();
        this.message = responseErrorEnum.getMessage();
    } 
} 