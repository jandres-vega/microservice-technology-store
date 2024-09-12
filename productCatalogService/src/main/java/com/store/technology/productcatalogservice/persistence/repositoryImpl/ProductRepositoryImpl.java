package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.dto.request.ProductRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.ProductResponseDTO;
import com.store.technology.productcatalogservice.domain.repository.ProductRepository;
import com.store.technology.productcatalogservice.persistence.crud.ProductCrudRepository;
import com.store.technology.productcatalogservice.persistence.entity.Product;
import com.store.technology.productcatalogservice.persistence.mapper.ProductMapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductCrudRepository productCrudRepository;
    private final ProductMapper productMapper;

    public ProductRepositoryImpl(ProductCrudRepository productCrudRepository, ProductMapper productMapper) {
        this.productCrudRepository = productCrudRepository;
        this.productMapper = productMapper;
    }


    @Override
    public ProductResponseDTO save(ProductRequestDTO product) {
        Product productSaved = productMapper.toProduct(product);
        return productMapper.toProductResponseDTO(productCrudRepository.save(productSaved));
    }

    @Override
    public List<ProductResponseDTO> findAll() {
        List<Product> products = (List<Product>) productCrudRepository.findAll();
        return productMapper.toProductResponseDTO(products);
    }
}
