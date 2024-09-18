package com.store.technology.productcatalogservice.domain.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageRequestDTO {

    @NotNull
    private String urlImage;
    @NotNull
    private String product_id;
}
