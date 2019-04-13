package com.example.demo.controller;

import com.example.demo.commons.JsonResult;
import com.example.demo.mapper.CourseRecordMapper;
import com.example.demo.pojo.CourseRecord;
import com.example.demo.service.CourseRecordService;
import com.example.demo.util.JsonResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/courserecord")
public class CourseRecordController {

    @Autowired
    private CourseRecordService courseRecordService;

    @RequestMapping("/getCourseRecordByUserIdCourseId")
    public JsonResult getCourseRecordByUserIdCourseId(Integer userId,Integer courseId,Integer planId){
        System.out.println("111");

        return JsonResultUtil.createSucess(courseRecordService.getCourseRecordByUserIdCourseId(userId,courseId,planId));
    }
}
