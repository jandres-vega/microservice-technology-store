package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.persistence.entity.Product;

import java.util.List;

public interface ProductRepository {

    Product save(Product product);
    List<Product> findAll();
}
