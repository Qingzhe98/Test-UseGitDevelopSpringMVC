package com.cskaoyan.service;

import com.cskaoyan.bean.User;

/**
 * @author Qingzhe
 * @create 2022-06-01 17:51
 */
public interface UserService {
    /**
     * 添加用户
     * 
     * @param user：用户对象，id为null
     * @return com.cskaoyan.bean.User:id通过自增主键获得后的用户对象
     * @author qingzhe
     * @since 2022/06/01 17:55
     */
    public User addUser(User user);

    // 删除用户

    // 更新用户

    // 查询用户

    // 查询所有用户

    // 查询用户总数

    // 根据id查询用户

}
