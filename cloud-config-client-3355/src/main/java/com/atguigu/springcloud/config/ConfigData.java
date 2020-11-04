package com.atguigu.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-09-22 19:54
 */
@Component
@RefreshScope
public class ConfigData {

    @Value("${config.info}")
    private String configInfo;

    public String getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
    }
}
