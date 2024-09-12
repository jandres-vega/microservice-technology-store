package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.domain.dto.CategoryDTO;

import java.util.List;

public interface CategoryRepository {

    CategoryDTO save(CategoryDTO categoryDTO);
    List<CategoryDTO> findAll();
}
