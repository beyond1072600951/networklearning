package com.example.demo.controller;

import com.example.demo.commons.JsonResult;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/userinfo")
    public User findUserByUserName(String userName,HttpServletRequest request){
        User user = userMapper.findUserByUserName(userName);
        request.setAttribute("user",user);
        System.out.println(user.toString());
        return user;
    }
    @RequestMapping("/editUser")
    public JsonResult editUser(User user){
       Integer result=userMapper.updateUser(user);
        return new JsonResult(true,null,1,"更新成功!");
    }
}
