package com.store.technology.productcatalogservice.persistence.crud;

import com.store.technology.productcatalogservice.persistence.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, String> {

    Category findByNameCategory(String nameCategory);
}

