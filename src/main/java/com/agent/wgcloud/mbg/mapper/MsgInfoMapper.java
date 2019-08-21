package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.MsgInfo;
import com.agent.wgcloud.mbg.model.MsgInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgInfoMapper {
    int countByExample(MsgInfoExample example);

    int deleteByExample(MsgInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(MsgInfo record);

    int insertSelective(MsgInfo record);

    List<MsgInfo> selectByExample(MsgInfoExample example);

    MsgInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MsgInfo record, @Param("example") MsgInfoExample example);

    int updateByExample(@Param("record") MsgInfo record, @Param("example") MsgInfoExample example);

    int updateByPrimaryKeySelective(MsgInfo record);

    int updateByPrimaryKey(MsgInfo record);
}