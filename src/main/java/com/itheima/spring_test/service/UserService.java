package com.itheima.spring_test.service;

import com.itheima.spring_test.dao.UserMapper;
import com.itheima.spring_test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring_test
 * @description:
 * @author: ZhangYuexin
 * @date : Created in 2019/7/15 8:29
 * @tips:
 */
@Service
public class UserService  {
    @Autowired
    private UserMapper userMapper;
    public List findAll(){
        return userMapper.selectList(null);
    }
}
