package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
