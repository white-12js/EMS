package com.hjh.springboot_ems.service.imp;

import com.hjh.springboot_ems.entity.User;
import com.hjh.springboot_ems.mapper.UserMapper;
import com.hjh.springboot_ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int login(String userName, String userPassword) {
        return userMapper.login(userName,userPassword);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
