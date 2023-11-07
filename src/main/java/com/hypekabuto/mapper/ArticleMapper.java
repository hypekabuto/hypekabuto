package com.hypekabuto.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hypekabuto.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 帖子 Mapper 接口
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
