package com.hypekabuto.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hypekabuto.entity.Article;

/**
 * <p>
 * 帖子 服务类
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
public interface IArticleService extends IService<Article> {
    Page<Article> selectArticleByTime(String way, String theme, String pageNum,Integer pageSize,String articleTitle);
}
