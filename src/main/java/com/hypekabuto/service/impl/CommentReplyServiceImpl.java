package com.hypekabuto.service.impl;

import com.hypekabuto.entity.CommentReply;
import com.hypekabuto.mapper.CommentReplyMapper;
import com.hypekabuto.service.ICommentReplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 回复 服务实现类
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Service
public class CommentReplyServiceImpl extends ServiceImpl<CommentReplyMapper, CommentReply> implements ICommentReplyService {

}
