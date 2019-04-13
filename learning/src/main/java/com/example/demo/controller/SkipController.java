package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ypc on 2019-4-8.
 */
@RequestMapping("skip")
@Controller
public class SkipController {
    @Autowired
    private UserService userService;


    @RequestMapping("/index")
    public String index(){
        return "login/index" ;
    }


    @RequestMapping("/main")
    public String main(HttpServletRequest request){
        String currentUsername= (String) request.getSession().getAttribute("currentUser");
        request.setAttribute("currentUser",currentUsername);
        User user=userService.findUserByUserName(currentUsername);
        request.setAttribute("user",user);
        return "main/main" ;
    }
    @RequestMapping("/user")
    public String user(HttpServletRequest request){
        String currentUsername= (String) request.getSession().getAttribute("currentUser");
        User user=userService.findUserByUserName(currentUsername);
        request.setAttribute("user",user);
        return "user/user" ;
    }
    @RequestMapping("/editUser")
    public String editUser(HttpServletRequest request){
        String currentUsername= (String) request.getSession().getAttribute("currentUser");
        User user=userService.findUserByUserName(currentUsername);
        request.setAttribute("user",user);
        return "user/editUser" ;
    }
    @RequestMapping("/coursebase")
    public String tooString(){
        System.out.println("skip");
        return "/coursebase/list";
    }

}
