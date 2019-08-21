package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.SysLoadState;
import com.agent.wgcloud.mbg.model.SysLoadStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLoadStateMapper {
    int countByExample(SysLoadStateExample example);

    int deleteByExample(SysLoadStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysLoadState record);

    int insertSelective(SysLoadState record);

    List<SysLoadState> selectByExample(SysLoadStateExample example);

    SysLoadState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysLoadState record, @Param("example") SysLoadStateExample example);

    int updateByExample(@Param("record") SysLoadState record, @Param("example") SysLoadStateExample example);

    int updateByPrimaryKeySelective(SysLoadState record);

    int updateByPrimaryKey(SysLoadState record);
}