package com.example.demo.controller;

import com.example.demo.commons.JsonResult;
import com.example.demo.pojo.CourseBase;
import com.example.demo.pojo.User;
import com.example.demo.service.CourseBaseService;
import com.example.demo.service.UserService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/index")
    public JsonResult Login(String ln, String pd, HttpServletRequest request){

        User user = userService.LoginByUserName(ln);
        User user1 = userService.findUserByUserName(user.getUserName());
        if(!pd.equals(user.getPassWord())){
            return new JsonResult(false,user,-1,"error");
        }
        request.getSession().setAttribute("currentUser",user.getUserName());
        return new JsonResult(true,user,1,"success");
    }
    @RequestMapping(value="/register")
    public JsonResult Register(User user){
        // TODO: 2019/4/10 username判断是否存在
        User user1=userService.findUserByUserName(user.getUserName());
        if(user1!=null){
            return new JsonResult(false,user,-1,"用户名已经存在！");

        }else{
            return userService.addUser(user)>0?new JsonResult(true,user,1,"success"):new JsonResult(false,user,-1,"添加失败！");
        }
    }

}
