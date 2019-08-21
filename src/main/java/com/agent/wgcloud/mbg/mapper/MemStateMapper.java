package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.MemState;
import com.agent.wgcloud.mbg.model.MemStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemStateMapper {
    int countByExample(MemStateExample example);

    int deleteByExample(MemStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemState record);

    int insertSelective(MemState record);

    List<MemState> selectByExample(MemStateExample example);

    MemState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemState record, @Param("example") MemStateExample example);

    int updateByExample(@Param("record") MemState record, @Param("example") MemStateExample example);

    int updateByPrimaryKeySelective(MemState record);

    int updateByPrimaryKey(MemState record);
}