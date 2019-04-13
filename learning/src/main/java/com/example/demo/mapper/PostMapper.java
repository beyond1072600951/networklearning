package com.example.demo.mapper;

import com.example.demo.pojo.Post;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    Post getPostList(@Param("id") Integer id);
}
