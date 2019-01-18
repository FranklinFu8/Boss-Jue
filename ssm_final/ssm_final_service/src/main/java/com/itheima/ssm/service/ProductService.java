package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: FranklinFu
 * @Date: 2019/1/17 21:24
 */
public interface ProductService {
    /**
     * 查询所有产品信息
     *
     * @return
     */
    List<Product> findAll();
}
