package com.store.technology.productcatalogservice.domain.repository;

import com.store.technology.productcatalogservice.domain.dto.response.BucketDTO;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IBucket {

    List<BucketDTO> uploadFile(MultipartFile[] file);
}
