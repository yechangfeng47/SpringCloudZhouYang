package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @auther zzyy
 * @create 2020-10-29 22:19
 */
@Mapper
public interface AccountDao {

    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);

}
