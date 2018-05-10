package com.imooc2.demo2.service.impl;

import com.imooc2.demo2.entity.User;
import com.imooc2.demo2.mapper.UserMapper;
import com.imooc2.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User findById(int userId) {

        return userMapper.selectByPrimaryKey(userId);
    }
}
