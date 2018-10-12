package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.pojo.KeyOut;
import com.example.Springbootdemo.pojo.KeyOutExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface KeyOutMapper {
    long countByExample(KeyOutExample example);

    int deleteByExample(KeyOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KeyOut record);

    int insertSelective(KeyOut record);

    List<KeyOut> selectByExample(KeyOutExample example);

    KeyOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KeyOut record, @Param("example") KeyOutExample example);

    int updateByExample(@Param("record") KeyOut record, @Param("example") KeyOutExample example);

    int updateByPrimaryKeySelective(KeyOut record);

    int updateByPrimaryKey(KeyOut record);
}