package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.pojo.Datastream;

public interface DatastreamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Datastream record);

    int insertSelective(Datastream record);

    Datastream selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Datastream record);

    int updateByPrimaryKey(Datastream record);
}