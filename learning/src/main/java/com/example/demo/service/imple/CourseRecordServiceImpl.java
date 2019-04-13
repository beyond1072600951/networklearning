package com.example.demo.service.imple;

import com.example.demo.mapper.CourseRecordMapper;
import com.example.demo.pojo.CourseRecord;
import com.example.demo.service.CourseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseRecordServiceImpl implements CourseRecordService {

    @Autowired
    CourseRecordMapper courseRecordMapper;

    @Override
    public List<CourseRecord> getCourseRecordByUserIdCourseId(Integer userId, Integer courseId, Integer planId) {
        return courseRecordMapper.getCourseRecordByUserIdCourseId(userId,courseId,planId);
    }
}
