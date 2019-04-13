package com.example.demo.service.imple;

import com.example.demo.mapper.CourseBaseMapper;
import com.example.demo.pojo.CourseBase;
import com.example.demo.service.CourseBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.monitor.CounterMonitor;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseBaseServiceImpl implements CourseBaseService {

    @Autowired
    CourseBaseMapper courseBaseMapper;
    @Override
    public List<CourseBase> getCourseBaseList(Integer status) {
        List<CourseBase> courseBaseList = (List<CourseBase>) courseBaseMapper.getCourseBaseList(1);
        return courseBaseList;
    }

    @Override
    public List<CourseBase> findCourseBaseByName(String name) {
        List<CourseBase> courseBaseList = (List<CourseBase>) courseBaseMapper.findCourseBaseByName(name);
        return courseBaseList;
    }

    @Override
    public Integer addCoueseBase(CourseBase courseBase) {
        return courseBaseMapper.addCourseBase(courseBase);
    }

    @Override
    public Integer updateCourseBase(CourseBase courseBase) {
        return courseBaseMapper.updateCourseBase(courseBase);
    }

    @Override
    public Integer deleteCourseBase(Integer id) {
        return courseBaseMapper.deleteCourseBase(id);
    }


}
