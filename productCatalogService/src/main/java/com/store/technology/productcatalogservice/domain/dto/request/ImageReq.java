package com.store.technology.productcatalogservice.domain.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageReq {

    private List<MultipartFile> urlImages;
    @NotNull
    @UUID(message = "El id del producto debe ser un UUID válido.")
    private String product_id;
}
