package com.hypekabuto.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Carousel {
    private static final long serialVersionUID = 1L;
    @TableField("carousel_id")
    private String carouselId;
    @TableField("carousel_title")
    private String carouselTitle;
    @TableField("article_id")
    private String articleId;
    @TableField("carousel_img")
    private String carouselImg;
}
