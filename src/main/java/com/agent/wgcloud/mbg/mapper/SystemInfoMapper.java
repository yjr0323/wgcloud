package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.SystemInfo;
import com.agent.wgcloud.mbg.model.SystemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemInfoMapper {
    int countByExample(SystemInfoExample example);

    int deleteByExample(SystemInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(SystemInfo record);

    int insertSelective(SystemInfo record);

    List<SystemInfo> selectByExample(SystemInfoExample example);

    SystemInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);

    int updateByExample(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);

    int updateByPrimaryKeySelective(SystemInfo record);

    int updateByPrimaryKey(SystemInfo record);
}