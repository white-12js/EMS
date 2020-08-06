package com.hjh.springboot_ems.controller;

import com.hjh.springboot_ems.entity.User;
import com.hjh.springboot_ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public @ResponseBody User login(@PathVariable int id){
        return userService.getUserById(id);
    }

    @RequestMapping("/login")
    public String login(String userName,String userPassword){
       if(1 == userService.login(userName,userPassword)){
           System.out.println("登录成功！");
           return "redirect:employee";
       }
        return "index";
    }
}
