package com.hypekabuto.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 帖子
 * </p>
 *
 * @author mjy
 * @since 2023-11-02
 */

@Data
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableField("article_id")
    private String articleId;
    @TableField("article_title")
    private String articleTitle;
    @TableField("user_id")
    private String userId;
    private Integer goods;
    private Integer caches;
    @TableField("article_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime articleTime;
    @TableField("article_theme")
    private String articleTheme;
    @TableField("article_img")
    private String articleImg;

}
