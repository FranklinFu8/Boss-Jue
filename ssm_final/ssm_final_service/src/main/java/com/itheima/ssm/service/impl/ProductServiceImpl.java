package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: FranklinFu
 * @Date: 2019/1/17 21:25
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
