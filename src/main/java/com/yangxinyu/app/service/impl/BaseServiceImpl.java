package com.yangxinyu.app.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangxinyu.app.service.BasesService;

import javax.annotation.Resource;

/**
 * @author : 星宇
 * @since : 2023/05/08
 */
public class BaseServiceImpl <M extends BaseMapper<T>,T> implements BasesService {
    @Resource
    protected M baseMapper;
}
