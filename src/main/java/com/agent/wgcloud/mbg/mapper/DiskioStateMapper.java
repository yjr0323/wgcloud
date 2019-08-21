package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.DiskioState;
import com.agent.wgcloud.mbg.model.DiskioStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiskioStateMapper {
    int countByExample(DiskioStateExample example);

    int deleteByExample(DiskioStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(DiskioState record);

    int insertSelective(DiskioState record);

    List<DiskioState> selectByExample(DiskioStateExample example);

    DiskioState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DiskioState record, @Param("example") DiskioStateExample example);

    int updateByExample(@Param("record") DiskioState record, @Param("example") DiskioStateExample example);

    int updateByPrimaryKeySelective(DiskioState record);

    int updateByPrimaryKey(DiskioState record);
}