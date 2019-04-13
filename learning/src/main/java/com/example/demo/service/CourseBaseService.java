package com.example.demo.service;

import com.example.demo.pojo.CourseBase;

import java.util.List;

public interface CourseBaseService {

    List<CourseBase> getCourseBaseList(Integer status);
    List<CourseBase> findCourseBaseByName(String name);
    Integer addCoueseBase(CourseBase courseBase);
    Integer updateCourseBase(CourseBase courseBase);
    Integer deleteCourseBase(Integer id);

}
