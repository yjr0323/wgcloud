package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.IntrusionInfo;
import com.agent.wgcloud.mbg.model.IntrusionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntrusionInfoMapper {
    int countByExample(IntrusionInfoExample example);

    int deleteByExample(IntrusionInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(IntrusionInfo record);

    int insertSelective(IntrusionInfo record);

    List<IntrusionInfo> selectByExampleWithBLOBs(IntrusionInfoExample example);

    List<IntrusionInfo> selectByExample(IntrusionInfoExample example);

    IntrusionInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IntrusionInfo record, @Param("example") IntrusionInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IntrusionInfo record, @Param("example") IntrusionInfoExample example);

    int updateByExample(@Param("record") IntrusionInfo record, @Param("example") IntrusionInfoExample example);

    int updateByPrimaryKeySelective(IntrusionInfo record);

    int updateByPrimaryKeyWithBLOBs(IntrusionInfo record);

    int updateByPrimaryKey(IntrusionInfo record);
}