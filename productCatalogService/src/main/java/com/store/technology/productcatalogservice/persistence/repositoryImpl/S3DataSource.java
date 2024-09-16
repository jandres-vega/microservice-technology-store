package com.store.technology.productcatalogservice.persistence.repositoryImpl;

import com.store.technology.productcatalogservice.domain.dto.response.BucketDTO;
import com.store.technology.productcatalogservice.domain.repository.IBucket;
import com.store.technology.productcatalogservice.remote.S3Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

@Configuration
@EnableConfigurationProperties
public class S3DataSource implements IBucket {

    @Value("${aws.credentials.s3.bucket}")
    private String bucketName;
    @Value("${aws.credentials.accessKey}")
    private String accessKey;
    @Value("${aws.credentials.secretKey}")
    private String secretKey;

    S3Client s3Client;

    public S3DataSource() {
        this.s3Client = new S3Client();
    }

    @Override
    public BucketDTO uploadFile(MultipartFile file) {
        try {
            String fileName = file.getOriginalFilename();
            s3Client.getClientAWS(accessKey, secretKey).putObject(
                    bucketName, fileName, convertMultiPartToFile(file));

            return new BucketDTO(fileName, bucketName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static File convertMultiPartToFile(MultipartFile multipartFile) throws IOException {
        File file = new File(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(multipartFile.getBytes());
        outputStream.close();
        return file;
    }
}
