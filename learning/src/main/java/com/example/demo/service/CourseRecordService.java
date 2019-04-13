package com.example.demo.service;

import com.example.demo.pojo.CourseRecord;

import java.util.List;

public interface CourseRecordService {
    List<CourseRecord> getCourseRecordByUserIdCourseId(Integer userId,Integer courseId,Integer planId);

}
