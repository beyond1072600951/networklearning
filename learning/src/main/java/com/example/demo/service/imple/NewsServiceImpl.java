package com.example.demo.service.imple;

import com.example.demo.mapper.NewsMapper;
import com.example.demo.pojo.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsMapper newsMapper;


    @Override
    public List<News> getNewsList() {
        List<News> newsList = (List<News>) newsMapper.getNewsList();
        return newsList;
    }
}
