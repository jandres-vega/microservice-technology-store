package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.dto.request.CategoryRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.CategoryResponseDTO;
import com.store.technology.productcatalogservice.domain.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryRequestDTO saveCategory(CategoryRequestDTO categoryDTO) {
        return categoryRepository.save(categoryDTO);
    }

    public List<CategoryResponseDTO> getAllCategories() {
        return categoryRepository.findAll();
    }

    public String deleteCategoryById(String id) {
        return categoryRepository.deleteCategoryById(id);
    }
}
