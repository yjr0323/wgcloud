package com.agent.wgcloud.mbg.mapper;

import com.agent.wgcloud.mbg.model.TcpState;
import com.agent.wgcloud.mbg.model.TcpStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcpStateMapper {
    int countByExample(TcpStateExample example);

    int deleteByExample(TcpStateExample example);

    int deleteByPrimaryKey(String id);

    int insert(TcpState record);

    int insertSelective(TcpState record);

    List<TcpState> selectByExample(TcpStateExample example);

    TcpState selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TcpState record, @Param("example") TcpStateExample example);

    int updateByExample(@Param("record") TcpState record, @Param("example") TcpStateExample example);

    int updateByPrimaryKeySelective(TcpState record);

    int updateByPrimaryKey(TcpState record);
}