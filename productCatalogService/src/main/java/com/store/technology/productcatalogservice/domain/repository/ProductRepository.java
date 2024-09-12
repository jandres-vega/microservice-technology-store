package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.domain.dto.request.ProductRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.ProductResponseDTO;

import java.util.List;

public interface ProductRepository {

    ProductResponseDTO save(ProductRequestDTO product);
    List<ProductResponseDTO> findAll();
}
