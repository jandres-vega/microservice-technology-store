package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.dto.request.ProductRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.ProductResponseDTO;
import com.store.technology.productcatalogservice.domain.repository.ProductRepository;
import com.store.technology.productcatalogservice.exceptions.ConflicException;
import org.springframework.http.HttpStatus;
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
        ProductResponseDTO productFind = productRepository.getProductByName(product.getProduct_name());
        if(productFind != null){
            throw new ConflicException("The product is already registered", "Product", product.getProduct_name(), HttpStatus.CONFLICT);
        }
        return productRepository.save(product);
    }

    public ProductResponseDTO getProductById(String id){
        ProductResponseDTO productFind = productRepository.getProductById(id);
        if (productFind == null){
            throw new ConflicException("The product does not exist", "Product", id, HttpStatus.NOT_FOUND);
        }
        return productFind;
    }
}
