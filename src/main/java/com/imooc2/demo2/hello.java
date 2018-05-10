package com.imooc2.demo2;

import com.imooc2.demo2.utils.IMoocJSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        return "Hello SpringBoot!";
    }

    @RequestMapping(value = "/test")
    public IMoocJSONResult test()
    {
        return IMoocJSONResult.ok("123");
    }
}
