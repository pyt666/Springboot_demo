package com.example.Springbootdemo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.Springbootdemo.pojo.User;
@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}