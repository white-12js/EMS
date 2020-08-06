package com.hjh.springboot_ems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {
    @GetMapping("test")
    public String testSpringBoot(){
        System.out.println("textSpringBoot mothed invoke!!");
        return "test mothed test OK";
    }
}
