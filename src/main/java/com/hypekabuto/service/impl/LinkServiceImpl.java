package com.hypekabuto.service.impl;

import com.hypekabuto.entity.Link;
import com.hypekabuto.mapper.LinkMapper;
import com.hypekabuto.service.ILinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 友情链接 服务实现类
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements ILinkService {

}
