package com.example.lesson.dao;

import com.example.lesson.record.ProductRecord;

import java.util.List;

public interface ProductDao {
    List<ProductRecord> findAll();

    ProductRecord findById(int id);

    int insert(ProductRecord product);

    int update(ProductRecord product);

    int delete(int id);

}