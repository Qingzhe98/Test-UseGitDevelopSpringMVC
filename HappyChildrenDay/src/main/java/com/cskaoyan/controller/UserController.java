package com.cskaoyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;

/**
 * @author Qingzhe
 * @create 2022-05-30 20:30
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("user/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);

    }

}
