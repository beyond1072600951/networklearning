package com.example.demo.mapper;

import com.example.demo.pojo.Statistics;
import org.apache.ibatis.annotations.Param;

public interface StatisticsMapper {
    Statistics getStatisticsList(@Param("id") Integer id);
}
