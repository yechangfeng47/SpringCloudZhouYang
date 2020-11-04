package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @auther zzyy
 * @create 2020-10-29 19:06
 */
@Data
public class Account {

    private Long id;


    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;


    /**
     * 已用额度
     */
    private  BigDecimal used;


    /**
     * 剩余额度
     */
    private  BigDecimal residue;
}
