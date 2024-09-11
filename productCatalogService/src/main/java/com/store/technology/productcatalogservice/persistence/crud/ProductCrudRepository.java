package com.store.technology.productcatalogservice.persistence.crud;

import com.store.technology.productcatalogservice.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, String> { }
