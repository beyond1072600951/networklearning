package com.example.demo.mapper;

import com.example.demo.pojo.News;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    News getNewsList();
}
