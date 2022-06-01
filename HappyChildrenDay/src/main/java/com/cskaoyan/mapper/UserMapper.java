package com.cskaoyan.mapper;

import java.util.List;

import com.cskaoyan.bean.User;

/**
 * @author Qingzhe
 * @create 2022-05-30 21:05
 */

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findUsers(String name);
}