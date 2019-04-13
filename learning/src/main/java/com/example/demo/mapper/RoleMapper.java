package com.example.demo.mapper;

import com.example.demo.pojo.Role;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    Role getRoleList(@Param("id") Integer id);
}
