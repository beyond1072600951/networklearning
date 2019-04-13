package com.example.demo.mapper;

import com.example.demo.pojo.CourseResource;
import org.apache.ibatis.annotations.Param;

public interface CourseResourceMapper {
    CourseResource getCourseResourceList(@Param("id") Integer id);
}
