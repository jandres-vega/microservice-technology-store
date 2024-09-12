package com.store.technology.productcatalogservice.domain.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class CategoryResponseWithProductsDTO {

    private String id;
    private String category;
    private String description;
    private List<ProductResponseDTO> products;
}
