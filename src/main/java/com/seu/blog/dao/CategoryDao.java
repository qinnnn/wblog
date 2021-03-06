package com.seu.blog.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seu.blog.entity.CategoryEntity;
import com.seu.blog.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 文章类别表
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
    /**
     * 文章分类详情
     *
     * @return
     */
    List<CategoryVo> queryCategoryDetails();

    /**
     * 单条文章分类详情
     *
     * @return
     */
    CategoryVo queryOneCategoryDetail(Integer categoryId);
}

