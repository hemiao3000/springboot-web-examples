package com.example.springbootwebexample6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping("/400")
    public String error400() {
        return "400";
    }

    @RequestMapping("/500")
    public String error500() {
        return "500";
    }
}
