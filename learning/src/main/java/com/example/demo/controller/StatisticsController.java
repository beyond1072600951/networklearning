package com.example.demo.controller;

import com.example.demo.service.CourseResourceService;
import com.example.demo.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    public void tooString(){
        System.out.println(statisticsService.getStatisticsList(1));
    }
}
