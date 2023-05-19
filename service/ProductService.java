package com.example.lesson.service;

import com.example.lesson.record.ProductRecord;
import java.util.List;

public interface ProductService {
    List<ProductRecord> findAll();

    ProductRecord findById(int id);

    int insert(ProductRecord product);

    int update(ProductRecord product);

    int delete(int id);
}
