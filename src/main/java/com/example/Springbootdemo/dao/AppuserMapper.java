package com.example.Springbootdemo.dao;

import com.example.Springbootdemo.pojo.Appuser;
import com.example.Springbootdemo.pojo.AppuserExample;
import java.util.List;
//import org.apache.ibatis.annotations.Param;

public interface AppuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    long countByExample(AppuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    int deleteByExample(AppuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    int insert(Appuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    int insertSelective(Appuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    List<Appuser> selectByExample(AppuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    Appuser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    //int updateByExampleSelective(@Param("record") Appuser record, @Param("example") AppuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    //int updateByExample(@Param("record") Appuser record, @Param("example") AppuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    int updateByPrimaryKeySelective(Appuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appuser
     *
     * @mbg.generated Sun Oct 07 20:47:34 CST 2018
     */
    int updateByPrimaryKey(Appuser record);
}