package com.store.technology.productcatalogservice.domain.dto.request;

import lombok.Data;

@Data
public class ProductRequestDTO {

    private String name_product;
    private String description;
    private Double price;
    private Integer stock;
    private String id_category;
}
