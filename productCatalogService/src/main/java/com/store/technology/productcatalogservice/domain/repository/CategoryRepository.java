package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.persistence.entity.Category;

import java.util.List;

public interface CategoryRepository {

    Category save(Category category);
    List<Category> findAll();
}
