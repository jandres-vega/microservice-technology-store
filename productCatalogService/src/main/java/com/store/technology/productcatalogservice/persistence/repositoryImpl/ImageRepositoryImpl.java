package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.dto.request.ImageRequestDTO;
import com.store.technology.productcatalogservice.domain.repository.ImageRepository;

import com.store.technology.productcatalogservice.persistence.crud.ImageCrudRepository;
import com.store.technology.productcatalogservice.persistence.entity.Image;
import com.store.technology.productcatalogservice.persistence.mapper.ImageMapper;
import org.springframework.stereotype.Repository;


@Repository
public class ImageRepositoryImpl implements ImageRepository {

    private final ImageCrudRepository imageCrudRepository;

    private final ImageMapper imageMapper;

    public ImageRepositoryImpl(ImageCrudRepository imageCrudRepository, ImageMapper imageMapper) {
        this.imageCrudRepository = imageCrudRepository;
        this.imageMapper = imageMapper;
    }


    @Override
    public void addImageToProduct(ImageRequestDTO imageRequestDTO) {
        Image image = imageMapper.toImage(imageRequestDTO);
        imageCrudRepository.save(image);
    }
}
