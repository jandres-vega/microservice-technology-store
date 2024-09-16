package com.store.technology.productcatalogservice.persistence.crud;

import com.store.technology.productcatalogservice.persistence.entity.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageCrudRepository extends CrudRepository<Image, String> { }
