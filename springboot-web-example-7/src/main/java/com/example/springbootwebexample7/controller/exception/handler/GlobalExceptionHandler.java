package com.example.springbootwebexample7.controller.exception.handler;

import com.example.springbootwebexample7.controller.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    // 返回页面
    @ExceptionHandler(RuntimeException.class)
    public ModelAndView handle(RuntimeException e) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("errorPage");
        mav.addObject("code", 500);
        mav.addObject("msg", e.getMessage());

        return mav;
    }

    // 返回 JSON
    @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String, Object> handleMyException(MyException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", e.getCode());
        map.put("message", e.getMsg());
        return map;
    }
}
