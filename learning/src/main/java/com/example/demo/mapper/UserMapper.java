package com.example.demo.mapper;

import java.util.List;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



public interface UserMapper {
	User LoginByUserName(@Param("userName") String UserName);
	Integer addUser(User user);
	User findUserByUserName(@Param("userName") String userName);
//	User getUserById(@Param("userId") Integer id);
	Integer updateUser(User user);
//	void removeUserById(@Param("userId") Integer id);
}
