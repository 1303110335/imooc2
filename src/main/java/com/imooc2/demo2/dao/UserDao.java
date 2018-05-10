package com.imooc2.demo2.dao;

import com.imooc2.demo2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao{

    int insertUser(@Param("user") User user);

    User findByName(String name);
}