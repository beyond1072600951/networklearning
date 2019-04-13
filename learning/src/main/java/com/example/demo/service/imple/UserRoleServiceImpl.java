package com.example.demo.service.imple;

import com.example.demo.mapper.UserRoleMapper;
import com.example.demo.pojo.UserRole;
import com.example.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public UserRole getUserRoleList(Integer id) {
        UserRole userRole = userRoleMapper.getUserRoleList(id);
        return userRole;
    }
}
