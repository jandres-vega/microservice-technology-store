package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.repository.ProductRepository;
import com.store.technology.productcatalogservice.persistence.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}
