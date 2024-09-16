package com.store.technology.productcatalogservice.web.controller;

import com.store.technology.productcatalogservice.domain.dto.request.CategoryRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.CategoryResponseDTO;
import com.store.technology.productcatalogservice.domain.dto.response.CategoryResponseWithProductsDTO;
import com.store.technology.productcatalogservice.domain.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CategoryResponseDTO>> getAllCategories(){
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.getAllCategories());
    }

    @PostMapping("/save")
    public ResponseEntity<CategoryRequestDTO> saveCategory(@Valid @RequestBody CategoryRequestDTO categoryDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.saveCategory(categoryDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCategoryById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.deleteCategoryById(id));
    }

    @GetMapping("/find/{nameCategory}")
    public ResponseEntity<CategoryResponseWithProductsDTO> findCategoryWithProductsByName(@PathVariable String nameCategory) {
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.findCategoryWithProductsByName(nameCategory));
    }
}
