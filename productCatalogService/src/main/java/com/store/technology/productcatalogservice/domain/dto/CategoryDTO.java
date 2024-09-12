package com.store.technology.productcatalogservice.domain.dto;

import com.store.technology.productcatalogservice.persistence.entity.Product;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {

    private String categoryId;
    private String categoryName;
    private String description;
    private List<Product> products;
}
