package com.store.technology.productcatalogservice.domain.dto.request;

import com.store.technology.productcatalogservice.persistence.entity.Product;
import lombok.Data;

@Data
public class ImageRequestDTO {

    private String idImage;
    private String url;
    private Product product;
}
