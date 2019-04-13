package com.example.demo.controller;

import com.example.demo.commons.JsonResult;
import com.example.demo.pojo.CourseBase;
import com.example.demo.service.CourseBaseService;
import com.example.demo.util.JsonResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/couserbase")
public class CourseBaseController {

    @Autowired
    private CourseBaseService courseBaseService;


    @RequestMapping("/getCourseBaseList")
    public JsonResult getCourseBaseList(Integer status){

        return JsonResultUtil.createSucess(courseBaseService.getCourseBaseList(status));
    }


}
