package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.dto.CategoryDTO;
import com.store.technology.productcatalogservice.domain.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
        return categoryRepository.save(categoryDTO);
    }

    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll();
    }
}
