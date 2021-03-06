package com.seu.blog.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seu.blog.dto.ChildCommentDto;
import com.seu.blog.entity.CommentEntity;
import com.seu.blog.vo.CommentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 评论表
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {


    /**
     * 获取文章评论信息
     *
     * @param articleId
     * @return
     */
    List<CommentVo> queryArticleComments(Long articleId);

    /**
     * 获取子评论信息
     *
     * @param dto
     * @return
     */
    List<CommentVo> queryChildrenComments(ChildCommentDto dto);

}

