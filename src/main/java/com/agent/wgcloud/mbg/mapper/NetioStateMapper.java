package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.NetioState;
import com.agent.wgcloud.mbg.model.NetioStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetioStateMapper {
    int countByExample(NetioStateExample example);

    int deleteByExample(NetioStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(NetioState record);

    int insertSelective(NetioState record);

    List<NetioState> selectByExample(NetioStateExample example);

    NetioState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") NetioState record, @Param("example") NetioStateExample example);

    int updateByExample(@Param("record") NetioState record, @Param("example") NetioStateExample example);

    int updateByPrimaryKeySelective(NetioState record);

    int updateByPrimaryKey(NetioState record);
}