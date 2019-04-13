package com.example.demo.controller;

import com.example.demo.pojo.CourseResource;
import com.example.demo.service.CourseResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courseresource")
public class CourseResourceController {
    @Autowired
    private CourseResourceService courseResourceService;

    public void tooString(){
        System.out.println(courseResourceService.getCourseResourceList(1));
    }
}
