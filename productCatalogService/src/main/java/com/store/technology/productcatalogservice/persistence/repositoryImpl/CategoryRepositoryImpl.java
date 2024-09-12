package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.dto.request.CategoryRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.CategoryResponseDTO;
import com.store.technology.productcatalogservice.domain.dto.response.CategoryResponseWithProductsDTO;
import com.store.technology.productcatalogservice.domain.repository.CategoryRepository;
import com.store.technology.productcatalogservice.persistence.crud.CategoryCrudRepository;
import com.store.technology.productcatalogservice.persistence.entity.Category;
import com.store.technology.productcatalogservice.persistence.mapper.CategoryMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryCrudRepository categoryCrudRepository;

    private final CategoryMapper categoryMapper;

    public CategoryRepositoryImpl(CategoryCrudRepository categoryCrudRepository, CategoryMapper categoryMapper) {
        this.categoryCrudRepository = categoryCrudRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public CategoryRequestDTO save(CategoryRequestDTO categoryDTO) {
        Category category = categoryMapper.toCategory(categoryDTO);
        return categoryMapper.toCategoryRequestDTO(categoryCrudRepository.save(category));
    }

    @Override
    public List<CategoryResponseDTO> findAll() {
        List<Category> categories = (List<Category>) categoryCrudRepository.findAll();
        return categoryMapper.toCategoryResponseDTO(categories);
    }

    @Override
    public String deleteCategoryById(String id) {
        categoryCrudRepository.deleteById(id);
        return "Removed Category with ID: " + id;
    }

    @Override
    public CategoryResponseWithProductsDTO findCategoryWithProductsByName(String nameCategory) {
        Category category = categoryCrudRepository.findByNameCategory(nameCategory);
        return categoryMapper.toCategoryResponseWithProductsDTO(category);
    }
}
