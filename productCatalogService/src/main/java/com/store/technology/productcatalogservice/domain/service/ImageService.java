package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.dto.response.BucketDTO;
import com.store.technology.productcatalogservice.domain.dto.response.ProductResponseDTO;
import com.store.technology.productcatalogservice.domain.repository.IBucket;
import com.store.technology.productcatalogservice.domain.repository.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {

    private final ImageRepository imageRepository;
    private final ProductService productService;
    private final IBucket bucketDataSource;

    public ImageService(ImageRepository imageRepository, ProductService productService, IBucket bucketDataSource) {
        this.imageRepository = imageRepository;
        this.productService = productService;
        this.bucketDataSource = bucketDataSource;
    }

    public String addImageToProduct(String productId, MultipartFile file) {
        ProductResponseDTO product = productService.getProductById(productId);

        BucketDTO bucketDTO = bucketDataSource.uploadFile(file);

        System.out.println("BUCKET " + bucketDTO);
        return "BUCKET ";

    }
}
