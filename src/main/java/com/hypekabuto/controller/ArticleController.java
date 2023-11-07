package com.hypekabuto.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hypekabuto.common.response.Resp;
import com.hypekabuto.entity.Article;
import com.hypekabuto.service.IArticleService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 * 帖子 前端控制器
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    IArticleService articleService;
    @GetMapping(value = "/selectHomeView")
    public Resp<Article> selectHomeView(@RequestParam(value = "way",defaultValue = "1")String way,
                                   @RequestParam(value = "theme",defaultValue = "all")String theme,
                                   @RequestParam(value = "pageNum",defaultValue = "1")String pageNum,
                                   @RequestParam(value = "pageSize")Integer pageSize,
                                   @RequestParam(value = "articleTitle",required = false)String articleTitle){
        Page<Article> articlePage = articleService.selectArticleByTime(way, theme, pageNum,pageSize,articleTitle);
        return Resp.success("success",articlePage);
    }
}
