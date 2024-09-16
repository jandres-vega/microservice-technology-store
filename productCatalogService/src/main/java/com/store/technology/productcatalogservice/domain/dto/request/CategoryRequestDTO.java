package com.store.technology.productcatalogservice.domain.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoryRequestDTO {

    @NotNull(message = "Category cannot be null")
    @NotEmpty(message = "Category cannot be empty")
    @Size(min = 3, max = 10, message = "Category must be between 3 and 10 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Category must contain only letters and spaces")
    private String category;
    @NotNull(message = "Description cannot be null")
    @NotEmpty(message = "Description cannot be empty")
    @Size(min = 3, message = "Description must be between 3 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Description must contain only letters and spaces")
    private String description;
}
