package com.store.technology.productcatalogservice.domain.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.UUID;

@Data
public class ProductRequestDTO {

    @NotNull
    @Size(min = 3, message = "The name must be between 3 and 10 characters")
    private String product_name;
    @NotNull
    @Size(min = 3, max = 100, message = "The description must be between 3 and 100 characters")
    private String description;
    @NotNull
    @DecimalMin(value = "0.01", message = "Price must be greater than or equal to 0.01")
    private Double price;
    @NotNull
    @Min(value = 0, message = "Stock must be a positive integer")
    private Integer stock;
    @NotNull
    @UUID
    private String id_category;
}
