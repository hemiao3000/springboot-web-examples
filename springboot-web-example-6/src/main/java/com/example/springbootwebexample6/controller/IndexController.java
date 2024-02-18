package com.example.springbootwebexample6.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        int n = 1 / 0;
        return "SUCCESS";
    }


}
