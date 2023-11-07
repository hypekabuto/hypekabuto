package com.hypekabuto.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hypekabuto.entity.Carousel;
import com.hypekabuto.entity.CommentReply;
import com.hypekabuto.mapper.CarouselMapper;
import com.hypekabuto.mapper.CommentReplyMapper;
import com.hypekabuto.service.ICarouselService;
import com.hypekabuto.service.ICommentReplyService;
import org.springframework.stereotype.Service;

@Service
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, Carousel> implements ICarouselService {

}
