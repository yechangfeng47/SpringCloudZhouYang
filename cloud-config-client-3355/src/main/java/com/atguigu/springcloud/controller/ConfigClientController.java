package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.config.ConfigData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-09-22 16:51
 */
@RestController
//@RefreshScope
public class ConfigClientController {

//    @Value("${config.info}")
//    private String configInfo;

    @Resource
    private ConfigData configData;

    @GetMapping("/configInfo")
    private String getConfigInfo(){

     return  configData.getConfigInfo();
    }

}
