package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.repository.ImageRepository;
import com.store.technology.productcatalogservice.persistence.entity.Image;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImageRepositoryImpl implements ImageRepository {
    @Override
    public Image save(Image image) {
        return null;
    }

    @Override
    public List<Image> findAll() {
        return List.of();
    }
}
