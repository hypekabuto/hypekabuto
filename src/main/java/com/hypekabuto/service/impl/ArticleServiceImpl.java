package com.hypekabuto.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hypekabuto.entity.Article;
import com.hypekabuto.mapper.ArticleMapper;
import com.hypekabuto.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 帖子 服务实现类
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Page<Article> selectArticleByTime(String way, String theme, String pageNum, Integer pageSize,String articleTitle) {
        Page<Article> page = new Page<>(Integer.parseInt(pageNum), pageSize);
        QueryWrapper<Article> wrapper = new QueryWrapper<>();
        if (!theme.equals("all")) {
            if (way.equals("1")) {
                wrapper.orderByDesc("article_time").eq("article_theme", theme);
            } else if (way.equals("2")) {
                wrapper.orderByAsc("article_time").eq("article_theme", theme);
            }
        } else {
            if (way.equals("1")) {
                wrapper.orderByDesc("article_time");
            } else if (way.equals("2")) {
                wrapper.orderByAsc("article_time");
            }
        }
        if(articleTitle != null){
            wrapper.eq("article_title",articleTitle).or().eq("article_theme","java");
        }
        return articleMapper.selectPage(page,wrapper);
    }
}
