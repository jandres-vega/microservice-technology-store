package com.store.technology.productcatalogservice.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageRequestDTO {

    private String urlImage;
    private String product_id;
}
