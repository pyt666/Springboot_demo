package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.pojo.Datastream;
import com.example.Springbootdemo.pojo.DatastreamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatastreamMapper {
    long countByExample(DatastreamExample example);

    int deleteByExample(DatastreamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Datastream record);

    int insertSelective(Datastream record);

    List<Datastream> selectByExample(DatastreamExample example);

    Datastream selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Datastream record, @Param("example") DatastreamExample example);

    int updateByExample(@Param("record") Datastream record, @Param("example") DatastreamExample example);

    int updateByPrimaryKeySelective(Datastream record);

    int updateByPrimaryKey(Datastream record);
}