package com.example.demo.service.imple;

import com.example.demo.mapper.CoursePlanMapper;
import com.example.demo.pojo.CoursePlan;
import com.example.demo.service.CoursePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursePlanServiceImpl implements CoursePlanService {

    @Autowired
    CoursePlanMapper coursePlanMapper;

    @Override
    public List<CoursePlan> getCoursePlanList(Integer courseId) {
        return coursePlanMapper.getPlanListByCourseId(courseId);
    }

    @Override
    public List<CoursePlan> getPlanRootByCourseId(Integer courseId) {
        return coursePlanMapper.getPlanRootByCourseId(courseId);
    }

    @Override
    public List<CoursePlan> getPlanByRootPlanId(Integer id) {
        return coursePlanMapper.getPlanByRootPlanId(id);
    }

    @Override
    public CoursePlan getPlanById(Integer id) {
        return coursePlanMapper.getPlanById(id);
    }


}
