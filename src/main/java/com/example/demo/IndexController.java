package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class IndexController {
    /**
     * 所有配置列表
     */
    @GetMapping("/")
    public String list(){

        System.out.println("hello demo:"+new Date());
        return "hello demo:"+new Date();
    }
}



