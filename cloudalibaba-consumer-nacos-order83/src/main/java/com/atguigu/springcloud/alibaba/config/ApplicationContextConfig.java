package com.atguigu.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zzyy
 * @create 2020-10-13 17:28
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
     public RestTemplate getRestTemplate(){
         return  new RestTemplate();
     }
}
