package com.hypekabuto.mapper;

import com.hypekabuto.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
