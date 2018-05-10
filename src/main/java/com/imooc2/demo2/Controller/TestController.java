package com.imooc2.demo2.Controller;

import com.imooc2.demo2.entity.User;
import com.imooc2.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public Integer add(User user){
        return userService.insertUser(user);
    }

    @RequestMapping("/findOne")
    public String findOne(Integer userId)
    {
        User user = userService.findById(userId);
        return user.toString();
    }
}
