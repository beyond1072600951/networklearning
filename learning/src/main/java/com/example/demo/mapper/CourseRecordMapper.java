package com.example.demo.mapper;

import com.example.demo.pojo.CourseRecord;

import java.util.List;

public interface CourseRecordMapper {
    List<CourseRecord> getCourseRecordByUserIdCourseId(Integer userId,Integer courseId,Integer planId);
}
