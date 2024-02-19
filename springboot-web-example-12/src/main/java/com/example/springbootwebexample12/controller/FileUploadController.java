package com.example.springbootwebexample12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class FileUploadController {

    @RequestMapping("/upload-page")
    public ModelAndView uploadPage() {
        System.out.println("/upload-page");
        return new ModelAndView("index");
    }
    @RequestMapping("/upload")
    public ModelAndView upload(@RequestParam("username") String username,
                         @RequestParam("password") String password,
                         @RequestPart("files") MultipartFile[] files) {
        System.out.println(username);
        System.out.println(password);
        Arrays.stream(files).forEach((file) -> System.out.println(file.getOriginalFilename()));

        return new ModelAndView("success");
    }
}
