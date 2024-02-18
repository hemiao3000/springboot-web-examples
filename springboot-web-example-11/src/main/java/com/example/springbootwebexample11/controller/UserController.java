package com.example.springbootwebexample11.controller;

import com.example.springbootwebexample11.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    /**
     * 查询用户列表
     */
    @CrossOrigin
    @GetMapping(value = "/users")
    public ResponseEntity<Map<String, Object>> getUserList() {
        Map<String, Object> map = new HashMap<>();
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "tommy", 20));
        userList.add(new User(2, "jerry", 19));
        map.put("result", userList);
        map.put("status", 200);

        return ResponseEntity.ok(map);
    }
}