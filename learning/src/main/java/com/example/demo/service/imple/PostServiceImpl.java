package com.example.demo.service.imple;

import com.example.demo.mapper.PostMapper;
import com.example.demo.pojo.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper postMapper;

    @Override
    public Post getPostList(Integer id) {

        Post post = postMapper.getPostList(id);
        return  post;

    }
}
