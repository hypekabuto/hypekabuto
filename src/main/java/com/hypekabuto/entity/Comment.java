package com.hypekabuto.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Repository
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章评论id
     */
    private String commentId;

    /**
     * 文章id
     */
    private String articleId;

    /**
     * 评论时间
     */
    private LocalDateTime commentTime;

    /**
     * 用户id(评论人)
     */
    private String userId;

    /**
     * 点赞次数
     */
    private Integer commentGoodNumber;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCommentGoodNumber() {
        return commentGoodNumber;
    }

    public void setCommentGoodNumber(Integer commentGoodNumber) {
        this.commentGoodNumber = commentGoodNumber;
    }

    @Override
    public String toString() {
        return "Comment{" +
            "commentId = " + commentId +
            ", articleId = " + articleId +
            ", commentTime = " + commentTime +
            ", userId = " + userId +
            ", commentGoodNumber = " + commentGoodNumber +
        "}";
    }
}
