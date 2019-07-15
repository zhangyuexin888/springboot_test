package com.itheima.spring_test.controller;

import com.itheima.spring_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: spring_test
 * @description:
 * @author: ZhangYuexin
 * @date : Created in 2019/7/15 8:37
 * @tips:
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("hello")
    public List hello(){
        return userService.findAll();
    }
}
