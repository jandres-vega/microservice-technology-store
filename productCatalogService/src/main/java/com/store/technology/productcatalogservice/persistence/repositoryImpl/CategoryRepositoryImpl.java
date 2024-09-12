package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.repository.CategoryRepository;
import com.store.technology.productcatalogservice.persistence.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return List.of();
    }
}
