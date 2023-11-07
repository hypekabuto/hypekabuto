package com.hypekabuto.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hypekabuto.common.response.Resp;
import com.hypekabuto.entity.Article;
import com.hypekabuto.entity.Carousel;
import com.hypekabuto.service.ICarouselService;
import com.hypekabuto.service.impl.CarouselServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    ICarouselService carouselService;
    @GetMapping(value = "/selectCarousel")
    public Resp<Article> selectCarousel(){
        List<Carousel> list = carouselService.list(null);
        return Resp.success(list);
    }
}
