package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.repository.CategoryRepository;
import com.store.technology.productcatalogservice.persistence.crud.CategoryCrudRepository;
import com.store.technology.productcatalogservice.persistence.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryCrudRepository categoryCrudRepository;

    public CategoryRepositoryImpl(CategoryCrudRepository categoryCrudRepository) {
        this.categoryCrudRepository = categoryCrudRepository;
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return List.of();
    }
}
