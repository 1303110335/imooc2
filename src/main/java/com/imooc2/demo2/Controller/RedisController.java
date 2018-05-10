package com.imooc2.demo2.Controller;

import com.imooc2.demo2.utils.IMoocJSONResult;
import com.imooc2.demo2.utils.JsonUtils;
import com.imooc2.demo2.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedis;

    @RequestMapping(value = "/test")
    public IMoocJSONResult test() {
        stringRedis.opsForValue().set("imooc-cache", "hello 慕课网~~~");

        SysUser user = new SysUser();
        user.setId("10011");
        user.setUsername("imooc");;
        user.setPassword("abc123");;
        user.setIsDelete(0);
        user.setRegistTime(new Date());
        stringRedis.opsForValue().set("json:user", JsonUtils.objectToJson(user));
        SysUser jsonUser = JsonUtils.jsonToPojo(stringRedis.opsForValue().get("json:user"), SysUser.class);
        return IMoocJSONResult.ok(jsonUser);
    }
}
