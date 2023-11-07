package com.hypekabuto.common.exception;

import com.hypekabuto.common.response.Resp;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public <T> Resp<T> exceptionHandler(Exception e){
        if(e instanceof AppException){
            AppException appException = (AppException)e;
            return Resp.error(appException.getCode(),appException.getMsg());
        }
        return Resp.error(500,e.getMessage());
    }
}
