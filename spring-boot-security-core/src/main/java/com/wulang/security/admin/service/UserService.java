package com.wulang.security.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wulang.security.admin.entity.collection.User;


/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2019-11-19 10:44:11
 */
public interface UserService extends IService<User> {

    int addSysUser(String username, Integer roleId);
}