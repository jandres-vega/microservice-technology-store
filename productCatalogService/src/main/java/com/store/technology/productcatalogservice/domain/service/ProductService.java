package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.dto.request.ProductRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.ProductResponseDTO;
import com.store.technology.productcatalogservice.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductResponseDTO> getProducts(){
        return productRepository.findAll();
    }

    public ProductResponseDTO saveProduct(ProductRequestDTO product){
        return productRepository.save(product);
    }
}
