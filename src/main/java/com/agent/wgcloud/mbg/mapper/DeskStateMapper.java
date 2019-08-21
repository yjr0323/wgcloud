package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.DeskState;
import com.agent.wgcloud.mbg.model.DeskStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeskStateMapper {
    int countByExample(DeskStateExample example);

    int deleteByExample(DeskStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeskState record);

    int insertSelective(DeskState record);

    List<DeskState> selectByExample(DeskStateExample example);

    DeskState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeskState record, @Param("example") DeskStateExample example);

    int updateByExample(@Param("record") DeskState record, @Param("example") DeskStateExample example);

    int updateByPrimaryKeySelective(DeskState record);

    int updateByPrimaryKey(DeskState record);
}