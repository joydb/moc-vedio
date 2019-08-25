package com.dbstudy.service.service.impl;

import com.dbstudy.mapper.entity.UsersEntity;

/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/25
 */

public interface UserService {
    /**
     * @Description 用户是否存在
     */
    boolean isExist(UsersEntity user);
    /**
     * @Description 存储用户
     */
    UsersEntity save(UsersEntity user);
    /**
     * @Description 初始化用户
     */
    UsersEntity initUser(UsersEntity user);
}
