package com.example.web;

import com.example.domain.LoginToken;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginToken token) {

        FormHttpMessageConverter converter1;
        MappingJackson2HttpMessageConverter converter2;

        System.out.println("username: " + token.getUsername());
        System.out.println("password: " + token.getPassword());

        Map<String, Object> map = new HashMap<>();
        map.put("code", 10000);
        map.put("msg", "success");

        return map;
    }

}
