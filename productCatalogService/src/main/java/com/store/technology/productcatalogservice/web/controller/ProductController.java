package com.store.technology.productcatalogservice.web.controller;

import com.store.technology.productcatalogservice.domain.dto.request.ProductRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.ProductResponseDTO;
import com.store.technology.productcatalogservice.domain.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductResponseDTO>> getProducts(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());
    }

    @PostMapping("/save")
    public ResponseEntity<ProductResponseDTO> saveProduct(@RequestBody ProductRequestDTO product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(product));
    }

}
