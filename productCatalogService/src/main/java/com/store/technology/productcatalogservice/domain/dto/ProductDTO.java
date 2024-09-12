package com.store.technology.productcatalogservice.domain.dto;

import com.store.technology.productcatalogservice.persistence.entity.Category;
import com.store.technology.productcatalogservice.persistence.entity.Image;
import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {

    private String idProduct;
    private String nameProduct;
    private String description;
    private Double price;
    private Integer stock;
    private Category category;
    private List<Image> images;
}
