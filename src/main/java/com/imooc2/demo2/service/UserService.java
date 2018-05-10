package com.imooc2.demo2.service;

import com.imooc2.demo2.entity.User;

public interface UserService {

    public int insertUser(User user);

    public User findById(int userId);
}
