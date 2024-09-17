package com.store.technology.productcatalogservice.domain.repository;


import com.store.technology.productcatalogservice.domain.dto.request.ImageRequestDTO;

public interface ImageRepository {

    void addImageToProduct(ImageRequestDTO imageRequestDTO);
}
