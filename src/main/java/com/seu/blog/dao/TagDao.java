package com.seu.blog.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seu.blog.entity.TagEntity;
import com.seu.blog.vo.TagVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 标签表
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Mapper
public interface TagDao extends BaseMapper<TagEntity> {
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

