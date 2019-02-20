package com.dao;

import com.pojo.Sellmx;
import com.pojo.SellmxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellmxMapper {
    int countByExample(SellmxExample example);

    int deleteByExample(SellmxExample example);

    int deleteByPrimaryKey(Integer sellmxno);

    int insert(Sellmx record);

    int insertSelective(Sellmx record);

    List<Sellmx> selectByExample(SellmxExample example);

    Sellmx selectByPrimaryKey(Integer sellmxno);

    int updateByExampleSelective(@Param("record") Sellmx record, @Param("example") SellmxExample example);

    int updateByExample(@Param("record") Sellmx record, @Param("example") SellmxExample example);

    int updateByPrimaryKeySelective(Sellmx record);

    int updateByPrimaryKey(Sellmx record);
}