package com.cskaoyan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.UserMapper;
import com.cskaoyan.service.UserService;

/**
 * @author Qingzhe
 * @create 2022-05-30 21:29
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Transactional
    public User addUser(User user) {
        userMapper.insertSelective(user);
        return user;
    }

}
