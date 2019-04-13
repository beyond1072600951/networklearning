package com.example.demo.service.imple;

import com.example.demo.mapper.ReplyMapper;
import com.example.demo.pojo.Reply;
import com.example.demo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    ReplyMapper replyMapper;
    @Override
    public Reply getReplyList(Integer id) {
        Reply reply = replyMapper.getReplyList(id);
        return reply;
    }
}
