package com.example.demo.service.imple;

import com.example.demo.mapper.CourseResourceMapper;
import com.example.demo.pojo.CourseResource;
import com.example.demo.service.CourseResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseResourceServiceImpl implements CourseResourceService {

    @Autowired
    CourseResourceMapper courseResourceMapper;

    @Override
    public CourseResource getCourseResourceList(Integer id) {
        CourseResource courseResource = courseResourceMapper.getCourseResourceList(id);

        return courseResource;
    }
}
