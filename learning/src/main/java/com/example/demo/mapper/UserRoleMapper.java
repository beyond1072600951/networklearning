package com.example.demo.mapper;

import com.example.demo.pojo.UserRole;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {

    UserRole getUserRoleList(@Param("id") Integer id);
}
