package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.AppState;
import com.agent.wgcloud.mbg.model.AppStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppStateMapper {
    int countByExample(AppStateExample example);

    int deleteByExample(AppStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppState record);

    int insertSelective(AppState record);

    List<AppState> selectByExample(AppStateExample example);

    AppState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppState record, @Param("example") AppStateExample example);

    int updateByExample(@Param("record") AppState record, @Param("example") AppStateExample example);

    int updateByPrimaryKeySelective(AppState record);

    int updateByPrimaryKey(AppState record);
}