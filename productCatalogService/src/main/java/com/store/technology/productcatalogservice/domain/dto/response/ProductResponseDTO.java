package com.store.technology.productcatalogservice.domain.dto.response;

import com.store.technology.productcatalogservice.persistence.entity.Image;
import lombok.Data;

import java.util.List;

@Data
public class ProductResponseDTO {

    private String idProduct;
    private String nameProduct;
    private String description;
    private Double price;
    private Integer stock;
    private List<Image> images;
}
