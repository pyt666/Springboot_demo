package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.pojo.DataHistory;
import com.example.Springbootdemo.pojo.DataHistoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DataHistoryMapper {
    long countByExample(DataHistoryExample example);

    int deleteByExample(DataHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataHistory record);

    int insertSelective(DataHistory record);

    List<DataHistory> selectByExample(DataHistoryExample example);

    DataHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataHistory record, @Param("example") DataHistoryExample example);

    int updateByExample(@Param("record") DataHistory record, @Param("example") DataHistoryExample example);

    int updateByPrimaryKeySelective(DataHistory record);

    int updateByPrimaryKey(DataHistory record);
}