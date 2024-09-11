package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.repository.ImageRepository;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }
}
