package com.hypekabuto.common.exception;

public enum AppExceptionCodeMsg {
    INVALID_CODE(10000,"验证码无效"),
    USERNAME_NOT_EXISTS(10001,"用户名不存在"),
    REQUEST_FAIL(10002,"请求失败"),
    SYSTEM_ERROR(10003,"系统异常"),
    OP_TIMEOUT(10004,"操作超时，请重试"),
    OP_CONFLICT(10005,"操作冲突"),
    DB_ERROR(10006,"数据库执行错误"),
    PARAMETER_ERROR(10007,"参数错误"),
    NO_PRIVILEGE(10008,"没有权限"),
    DATA_NOT_FOUND(1009,"数据不存在"),
    DATA_EXIST(10010,"数据已存在");
    private int code ;
    private String msg ;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    AppExceptionCodeMsg(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
