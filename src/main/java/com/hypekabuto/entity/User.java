package com.hypekabuto.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Repository
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 注册时间
     */
    private LocalDateTime userRegister;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDateTime getUserRegister() {
        return userRegister;
    }

    public void setUserRegister(LocalDateTime userRegister) {
        this.userRegister = userRegister;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId = " + userId +
            ", userName = " + userName +
            ", userPassword = " + userPassword +
            ", userRegister = " + userRegister +
        "}";
    }
}
