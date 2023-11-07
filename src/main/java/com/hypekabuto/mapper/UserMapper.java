package com.hypekabuto.mapper;

import com.hypekabuto.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> select1();
}
