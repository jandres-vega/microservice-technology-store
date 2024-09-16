package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.domain.dto.request.CategoryRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.CategoryResponseDTO;
import com.store.technology.productcatalogservice.domain.dto.response.CategoryResponseWithProductsDTO;

import java.util.List;

public interface CategoryRepository {

    CategoryRequestDTO save(CategoryRequestDTO categoryDTO);
    List<CategoryResponseDTO> findAll();
    String deleteCategoryById(String id);
    CategoryResponseWithProductsDTO findCategoryWithProductsByName(String nameCategory);
    boolean existsCategoryById(String id);
}
