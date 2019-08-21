package com.agent.wgcloud.Controller;

import com.agent.wgcloud.Common.api.CommonResult;
import com.agent.wgcloud.Service.AppInfoService;
import com.agent.wgcloud.mbg.model.AppInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: wgcloud
 * @description:
 * @author: Yjr
 * @create: 2019-08-21 15:22
 **/

@RestController
@RequestMapping("/AppInfo")
public class AppInfoController {
    @Autowired
    private    AppInfoService appInfoService;


    @GetMapping("/listAll")
    public CommonResult<List<AppInfo>> getAppInfoList(){
     return    CommonResult.success( appInfoService.listAllAppInfo());
    }
}
