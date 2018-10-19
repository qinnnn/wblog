package com.seu.blog.service;


import com.seu.blog.entity.UserEntity;
import com.seu.blog.entity.UserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    UserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     *
     * @param userId
     */
    UserEntity queryUser(Long userId);
}
