package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.pojo.UserApplication;
import com.example.Springbootdemo.pojo.UserApplicationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserApplicationMapper {
    long countByExample(UserApplicationExample example);

    int deleteByExample(UserApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserApplication record);

    int insertSelective(UserApplication record);

    List<UserApplication> selectByExample(UserApplicationExample example);

    UserApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserApplication record, @Param("example") UserApplicationExample example);

    int updateByExample(@Param("record") UserApplication record, @Param("example") UserApplicationExample example);

    int updateByPrimaryKeySelective(UserApplication record);

    int updateByPrimaryKey(UserApplication record);
}