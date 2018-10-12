package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.pojo.TriggerDs;
import com.example.Springbootdemo.pojo.TriggerDsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggerDsMapper {
    long countByExample(TriggerDsExample example);

    int deleteByExample(TriggerDsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TriggerDs record);

    int insertSelective(TriggerDs record);

    List<TriggerDs> selectByExample(TriggerDsExample example);

    TriggerDs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TriggerDs record, @Param("example") TriggerDsExample example);

    int updateByExample(@Param("record") TriggerDs record, @Param("example") TriggerDsExample example);

    int updateByPrimaryKeySelective(TriggerDs record);

    int updateByPrimaryKey(TriggerDs record);
}