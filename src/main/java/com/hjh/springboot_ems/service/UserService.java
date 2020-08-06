package com.hjh.springboot_ems.service;

import com.hjh.springboot_ems.entity.User;

public interface UserService {
    int login(String userName,String userPassword);
    User getUserById(Integer id);
}
