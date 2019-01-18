package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: FranklinFu
 * @Date: 2019/1/17 21:19
 */
public interface ProductDao {
    /**
     * 查询所有产品信息
     *
     * @return
     */
    @Select("select * from product")
    List<Product> findAll();
}
