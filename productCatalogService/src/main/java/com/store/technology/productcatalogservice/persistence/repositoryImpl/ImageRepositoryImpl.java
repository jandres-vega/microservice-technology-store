package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.repository.ImageRepository;

import com.store.technology.productcatalogservice.persistence.crud.ImageCrudRepository;
import com.store.technology.productcatalogservice.persistence.entity.Image;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class ImageRepositoryImpl implements ImageRepository {

    private final ImageCrudRepository imageCrudRepository;

    public ImageRepositoryImpl(ImageCrudRepository imageCrudRepository) {
        this.imageCrudRepository = imageCrudRepository;
    }

    @Override
    public Image addImageToProduct(String productId, MultipartFile file) {
        return null;
    }
}
