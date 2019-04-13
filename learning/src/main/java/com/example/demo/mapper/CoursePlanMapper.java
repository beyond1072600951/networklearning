package com.example.demo.mapper;

import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import com.example.demo.pojo.CoursePlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursePlanMapper {
    List<CoursePlan> getPlanListByCourseId(Integer courseId);
    List<CoursePlan> getPlanRootByCourseId(Integer courseId);
    List<CoursePlan> getPlanByRootPlanId(Integer id);
    CoursePlan getPlanById(Integer id);

}
