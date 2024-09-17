package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.dto.request.ImageRequestDTO;
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

    public ProductResponseDTO addImageToProduct(String productId, MultipartFile file) {
        ProductResponseDTO product = productService.getProductById(productId);

        BucketDTO bucketDTO = bucketDataSource.uploadFile(file);
        String urlImage = generateS3Url(bucketDTO.getBucket(), bucketDTO.getFileName());
        ImageRequestDTO imageRequestDTO = new ImageRequestDTO(
                urlImage,
                productId
        );
        imageRepository.addImageToProduct(imageRequestDTO);
        product.setImage(urlImage);
        return  product;
    }

    public static String generateS3Url(String bucketName, String fileName){
        return "https://" + bucketName + ".s3.amazonaws.com/" + fileName;
    }
}
