package com.csdeng.springbootinterceptor.service;

import com.csdeng.springbootinterceptor.annotation.AutoIdempotent;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @AutoIdempotent  //使用AOP方式
    public String myTest(String name){
        System.out.println("call mytest :" + name);
        return name;
    }

    public String myTest2(String name){
        System.out.println("call mytest2 :" + name);
        return name;
    }
}
