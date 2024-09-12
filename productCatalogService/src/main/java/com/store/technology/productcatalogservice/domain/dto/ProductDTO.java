package com.store.technology.productcatalogservice.domain.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private String idProduct;
    private String nameProduct;
    private String description;
    private Double price;
    private Integer stock;
    private String idCategory;
}
