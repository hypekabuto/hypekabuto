package com.hypekabuto.service.impl;

import com.hypekabuto.entity.Comment;
import com.hypekabuto.mapper.CommentMapper;
import com.hypekabuto.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
