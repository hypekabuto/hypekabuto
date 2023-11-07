package com.hypekabuto.controller;

import com.hypekabuto.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
}
