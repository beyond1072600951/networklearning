package com.example.demo.mapper;

import com.example.demo.pojo.Reply;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {
    Reply getReplyList(@Param("id") Integer id);

}
