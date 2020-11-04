package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther zzyy
 * @create 2020-09-03 19:30
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return  new RandomRule();
    }
}
