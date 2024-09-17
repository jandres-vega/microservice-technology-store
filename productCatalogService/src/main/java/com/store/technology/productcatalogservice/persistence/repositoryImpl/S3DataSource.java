package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.dto.response.BucketDTO;
import com.store.technology.productcatalogservice.domain.repository.IBucket;
import com.store.technology.productcatalogservice.remote.S3Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableConfigurationProperties
public class S3DataSource implements IBucket {

    @Value("${aws.credentials.s3.bucket}")
    private String bucketName;
    @Value("${aws.credentials.accessKey}")
    private String accessKey;
    @Value("${aws.credentials.secretKey}")
    private String secretKey;

    S3Config s3Client;

    public S3DataSource() {
        this.s3Client = new S3Config();
    }

    @Override
    public List<BucketDTO> uploadFile(MultipartFile[] files) {
        List<BucketDTO> bucketDTOList = new ArrayList<>();
        try {
            for(MultipartFile file: files){
                String fileName = file.getOriginalFilename();

                PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                        .bucket(bucketName)
                        .key(fileName)
                        .build();

                s3Client.getClientAWS(accessKey, secretKey)
                        .putObject(putObjectRequest, RequestBody.fromBytes(file.getBytes()));

                bucketDTOList.add(new BucketDTO(fileName, bucketName));
            }
            return bucketDTOList;
        } catch (Exception e) {
            throw new RuntimeException("Error to upload file");
        }
    }
}
