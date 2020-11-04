package com.atguigu.springcloud.alibaba.service;

/**
 * @auther zzyy
 * @create 2020-10-29 12:53
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
