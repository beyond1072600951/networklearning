package com.example.demo.mapper;

import com.example.demo.pojo.CourseBase;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CourseBaseMapper {
    List<CourseBase> getCourseBaseList(@Param("status") Integer status);
    List<CourseBase> findCourseBaseByName(@Param("name") String name);
    //todo byId
    Integer addCourseBase(CourseBase courseBase);
    Integer updateCourseBase(CourseBase courseBase);
    Integer deleteCourseBase(@Param("id") Integer id);
}
