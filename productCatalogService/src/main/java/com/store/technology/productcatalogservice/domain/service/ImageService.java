package com.store.technology.productcatalogservice.domain.service;

import com.store.technology.productcatalogservice.domain.dto.request.ImageReq;
import com.store.technology.productcatalogservice.domain.dto.request.ImageRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.BucketDTO;
import com.store.technology.productcatalogservice.domain.dto.response.ProductResponseDTO;
import com.store.technology.productcatalogservice.domain.repository.IBucket;
import com.store.technology.productcatalogservice.domain.repository.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

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

    public ProductResponseDTO addImageToProduct(String productId, List<MultipartFile> files) {
        ProductResponseDTO product = productService.getProductById(productId);

        List<BucketDTO> bucketDTO = bucketDataSource.uploadFile(files);
        List<String> listUrl = generateS3Url(bucketDTO);
        for (String url : listUrl) {
            imageRepository.addImageToProduct(new ImageRequestDTO(url, productId));
        }
        product.setImages(listUrl);
        return  product;
    }

    public static List<String> generateS3Url(List<BucketDTO> bucketDTO) {
        List<String> listUrl= new ArrayList<>();
        for (BucketDTO bucket : bucketDTO) {
            String url = "https://" + bucket.getBucket() + ".s3.amazonaws.com/" + bucket.getFileName();
            listUrl.add(url);
        }
        return listUrl;
    }
}
