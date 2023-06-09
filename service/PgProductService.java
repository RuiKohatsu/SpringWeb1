package com.example.lesson.service;

import com.example.lesson.ProductNotFoundException;
import com.example.lesson.dao.ProductDao;
import com.example.lesson.record.ProductRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PgProductService implements ProductService{
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private ProductDao productDao;

    @Override
    public List<ProductRecord> findAll() {
        // 本来は、例外処理が必要
        return productDao.findAll();
    }

    @Override
    public ProductRecord findById(int id) {
        var product = productDao.findById(id);
        if (product == null) {
            throw new ProductNotFoundException();
        }else{
            return product;
        }
    }

    @Override
    public int insert(ProductRecord product) {
        // 本来は、例外処理が必要
        return productDao.insert(product);
    }

    @Override
    public int update(ProductRecord product) {
        // 本来は、例外処理が必要
        return productDao.update(product);
    }

    @Override
    public int delete(int id) {
        // 本来は、例外処理が必要
        return productDao.delete(id);
    }

}
