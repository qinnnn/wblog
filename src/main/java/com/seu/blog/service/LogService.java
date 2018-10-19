package com.seu.blog.service;

import com.baomidou.mybatisplus.service.IService;
import com.seu.common.utils.PageUtils;
import com.seu.blog.entity.LogEntity;

import java.util.Map;

/**
 * 用户操作日志表
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
public interface LogService extends IService<LogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

