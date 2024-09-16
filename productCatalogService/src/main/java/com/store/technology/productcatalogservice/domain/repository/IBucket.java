package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.domain.dto.response.BucketDTO;
import org.springframework.web.multipart.MultipartFile;

public interface IBucket {

    BucketDTO uploadFile(MultipartFile file);
}
