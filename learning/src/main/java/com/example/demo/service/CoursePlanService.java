package com.example.demo.service;

import com.example.demo.pojo.CoursePlan;

import java.util.List;

public interface CoursePlanService {
    List<CoursePlan> getCoursePlanList(Integer courseId);
    List<CoursePlan> getPlanRootByCourseId(Integer courseId);
    List<CoursePlan> getPlanByRootPlanId(Integer id);
    CoursePlan getPlanById(Integer id);
}
