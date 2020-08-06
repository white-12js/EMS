package com.hjh.springboot_ems.mapper;

import com.hjh.springboot_ems.entity.User;

public interface UserMapper {
    int login(String userName,String userPassword);
    int register();
    User getUserById(Integer id);
}
