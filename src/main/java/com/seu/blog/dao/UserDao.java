package com.seu.blog.dao;

import com.seu.blog.entity.UserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

    /**
     * 根据用户名，查询系统用户
     */
    UserEntity queryByUserAccount(String account);

}

