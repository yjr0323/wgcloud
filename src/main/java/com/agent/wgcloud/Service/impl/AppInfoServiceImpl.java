package com.agent.wgcloud.Service.impl;

import com.agent.wgcloud.Service.AppInfoService;
import com.agent.wgcloud.mbg.mapper.AppInfoMapper;
import com.agent.wgcloud.mbg.model.AppInfo;
import com.agent.wgcloud.mbg.model.AppInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: wgcloud
 * @description:
 * @author: Yjr
 * @create: 2019-08-21 15:20
 **/
@Service
public class AppInfoServiceImpl implements AppInfoService {
    @Autowired
    private AppInfoMapper appInfoMapper;

    @Override
    public List<AppInfo> listAllAppInfo() {
        return   appInfoMapper.selectByExample(new AppInfoExample());

    }
}
