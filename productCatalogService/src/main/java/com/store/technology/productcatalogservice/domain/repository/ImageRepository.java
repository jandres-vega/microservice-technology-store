package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.persistence.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageRepository {

    Image addImageToProduct(String productId, MultipartFile file);
}
