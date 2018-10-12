package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.pojo.KeyIn;
import com.example.Springbootdemo.pojo.KeyInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyInMapper {
    long countByExample(KeyInExample example);

    int deleteByExample(KeyInExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KeyIn record);

    int insertSelective(KeyIn record);

    List<KeyIn> selectByExample(KeyInExample example);

    KeyIn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KeyIn record, @Param("example") KeyInExample example);

    int updateByExample(@Param("record") KeyIn record, @Param("example") KeyInExample example);

    int updateByPrimaryKeySelective(KeyIn record);

    int updateByPrimaryKey(KeyIn record);
}