/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.seu.service;

import com.seu.datasources.DataSourceNames;
import com.seu.datasources.annotation.DataSource;
import com.seu.blog.entity.UserEntity;
import com.seu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试多数据源
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Service
public class DataSourceTestService {
    @Autowired
    private UserService sysUserService;

    public UserEntity queryUser(Long userId){
        return sysUserService.selectById(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public UserEntity queryUser2(Long userId){
        return sysUserService.selectById(userId);
    }
}
