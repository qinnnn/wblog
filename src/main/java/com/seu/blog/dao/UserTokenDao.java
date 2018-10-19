package com.seu.blog.dao;

import com.seu.blog.entity.UserTokenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Mapper
public interface UserTokenDao extends BaseMapper<UserTokenEntity> {

    UserTokenEntity queryByToken(String token);

}

