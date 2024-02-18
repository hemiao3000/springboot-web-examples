package com.example.springbootwebexample7.controller;

import com.example.springbootwebexample7.controller.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
//        try {
            int i = 1 / 0;
//        } catch (RuntimeException e) {
//            throw new MyException("自定义异常");
//        }
        return "success";
    }

}
