package com.hypekabuto.service.impl;

import com.hypekabuto.entity.User;
import com.hypekabuto.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hypekabuto.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;

}
