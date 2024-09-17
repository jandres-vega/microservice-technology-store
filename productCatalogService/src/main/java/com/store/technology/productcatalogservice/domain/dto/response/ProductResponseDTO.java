package com.store.technology.productcatalogservice.domain.dto.response;

import lombok.Data;

import java.util.List;


@Data
public class ProductResponseDTO {

    private String id;
    private String product_name;
    private String description;
    private double price;
    private int stock;
    private List<String> images;
}
