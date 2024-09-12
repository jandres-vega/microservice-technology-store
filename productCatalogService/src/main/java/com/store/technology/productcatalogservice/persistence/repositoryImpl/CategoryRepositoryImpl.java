package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.dto.CategoryDTO;
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
    public CategoryDTO save(CategoryDTO categoryDTO) {
        Category category = categoryMapper.toCategory(categoryDTO);
        return categoryMapper.toCategoryDTO(categoryCrudRepository.save(category));
    }

    @Override
    public List<CategoryDTO> findAll() {
        List<Category> categories = (List<Category>) categoryCrudRepository.findAll();
        return categories.stream().map(categoryMapper::toCategoryDTO).toList();
    }
}
