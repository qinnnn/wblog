package com.seu.blog.service;

import com.baomidou.mybatisplus.service.IService;
import com.seu.blog.vo.TagVo;
import com.seu.common.utils.PageUtils;
import com.seu.blog.entity.TagEntity;

import java.util.List;
import java.util.Map;

/**
 * 标签表
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
public interface TagService extends IService<TagEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取标签详情
     *
     * @param tagIds
     * @return
     */
    List<TagEntity> queryHotTagDetails(Integer[] tagIds);

    /**
     * 查询标签详情
     *
     * @return
     */
    List<TagVo> queryTagDetails();

    /**
     * 查询单条标签详情
     *
     * @return
     */
    TagVo queryOneTagDetail(Integer tagId);
}

