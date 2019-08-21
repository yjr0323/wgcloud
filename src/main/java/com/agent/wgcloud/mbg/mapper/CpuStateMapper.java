package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.CpuState;
import com.agent.wgcloud.mbg.model.CpuStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpuStateMapper {
    int countByExample(CpuStateExample example);

    int deleteByExample(CpuStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(CpuState record);

    int insertSelective(CpuState record);

    List<CpuState> selectByExample(CpuStateExample example);

    CpuState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CpuState record, @Param("example") CpuStateExample example);

    int updateByExample(@Param("record") CpuState record, @Param("example") CpuStateExample example);

    int updateByPrimaryKeySelective(CpuState record);

    int updateByPrimaryKey(CpuState record);
}