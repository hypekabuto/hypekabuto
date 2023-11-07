package com.hypekabuto.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 回复
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Repository
@TableName("comment_reply")
public class CommentReply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论回复id
     */
    private String commentReplyId;

    /**
     * 评论id
     */
    private String commentId;

    /**
     * 用户id(回复评论人的id)
     */
    private String replyUserId;

    /**
     * 用户id(被回复人id)
     */
    private String repliedUserId;

    /**
     * 评论回复时间
     */
    private LocalDateTime commentReplyAddTime;

    public String getCommentReplyId() {
        return commentReplyId;
    }

    public void setCommentReplyId(String commentReplyId) {
        this.commentReplyId = commentReplyId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(String replyUserId) {
        this.replyUserId = replyUserId;
    }

    public String getRepliedUserId() {
        return repliedUserId;
    }

    public void setRepliedUserId(String repliedUserId) {
        this.repliedUserId = repliedUserId;
    }

    public LocalDateTime getCommentReplyAddTime() {
        return commentReplyAddTime;
    }

    public void setCommentReplyAddTime(LocalDateTime commentReplyAddTime) {
        this.commentReplyAddTime = commentReplyAddTime;
    }

    @Override
    public String toString() {
        return "CommentReply{" +
            "commentReplyId = " + commentReplyId +
            ", commentId = " + commentId +
            ", replyUserId = " + replyUserId +
            ", repliedUserId = " + repliedUserId +
            ", commentReplyAddTime = " + commentReplyAddTime +
        "}";
    }
}
