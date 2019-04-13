package com.example.demo.controller;

import com.example.demo.commons.JsonResult;
import com.example.demo.mapper.CoursePlanMapper;
import com.example.demo.pojo.CoursePlan;
import com.example.demo.service.CoursePlanService;
import com.example.demo.util.JsonResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courseplan")
public class CoursePlanController {

    @Autowired
    private CoursePlanService coursePlanService;


    @RequestMapping("/getCoursePlanList")
    public JsonResult getCoursePlanList(Integer courseId){

        return JsonResultUtil.createSucess(coursePlanService.getCoursePlanList(courseId));
    }
    @RequestMapping("/getPlanRootByCourseId")
    public JsonResult getPlanRootByCourseId(Integer courseId){

        return JsonResultUtil.createSucess(coursePlanService.getPlanRootByCourseId(courseId));
    }
    @RequestMapping("/getPlanByRootPlanId")
    public JsonResult getPlanByRootPlanId(Integer id){

        return JsonResultUtil.createSucess(coursePlanService.getPlanByRootPlanId(id));
    }
    @RequestMapping("/getPlanById")
    public JsonResult getPlanById(Integer id){

        return JsonResultUtil.createSucess(coursePlanService.getPlanById(id));
    }

}

