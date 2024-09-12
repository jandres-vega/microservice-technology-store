package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.persistence.entity.Image;

import java.util.List;

public interface ImageRepository {

    Image save(Image image);
    List<Image> findAll();
}
