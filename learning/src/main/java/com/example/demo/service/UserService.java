package com.example.demo.service;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User LoginByUserName(String UserName);

    User findUserByUserName(String userName);
    Integer addUser(User user);
    Integer updateUser(User user);

}
