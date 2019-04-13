package com.example.demo.service.imple;

import com.example.demo.mapper.StatisticsMapper;
import com.example.demo.pojo.Statistics;
import com.example.demo.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    StatisticsMapper statisticsMapper;
    @Override
    public Statistics getStatisticsList(Integer id) {
        Statistics statistics = statisticsMapper.getStatisticsList(id);
        return statistics;
    }
}
