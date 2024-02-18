package com.example.springbootwebexample4.controller;

import com.example.springbootwebexample4.annotation.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Log(name = "访问 index 接口")
    @RequestMapping("/index")
    public String index() {
        System.out.println("执行 index");
        return "welcome to my site";
    }
}
