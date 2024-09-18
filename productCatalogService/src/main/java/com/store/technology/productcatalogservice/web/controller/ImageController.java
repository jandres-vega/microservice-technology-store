package com.store.technology.productcatalogservice.web.controller;

import com.store.technology.productcatalogservice.domain.dto.request.ImageReq;
import com.store.technology.productcatalogservice.domain.service.ImageService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("images")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("/upload/{productId}")
    public ResponseEntity<?> saveImageProduct(@Valid @PathVariable String productId, @ModelAttribute ImageReq files){
        return ResponseEntity.status(HttpStatus.CREATED).body(imageService.addImageToProduct(productId, files.getUrlImages()));
    }
}
