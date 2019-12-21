package com.csdeng.springbootinterceptor.controller;

import com.csdeng.springbootinterceptor.annotation.AutoIdempotent;
import com.csdeng.springbootinterceptor.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class MyController {
    @Autowired
    private MyService myService;

    //@AutoIdempotent //使用Interceptor方式，则需要在controller中注解
    @RequestMapping("/test")
    public String test(@RequestParam String name){
        myService.myTest(name);
        return myService.myTestNonAutoIdempotent(name);
    }
}
