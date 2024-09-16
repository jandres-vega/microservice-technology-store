package com.store.technology.productcatalogservice.persistence.mapper;

import com.store.technology.productcatalogservice.domain.dto.request.ProductRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.ProductResponseDTO;

import com.store.technology.productcatalogservice.persistence.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(target = "id", source = "idProduct"),
            @Mapping(target = "product_name", source = "nameProduct")
    })
    ProductResponseDTO toProductResponseDTO(Product product);

    List<ProductResponseDTO> toProductResponseDTO(List<Product> products);

@InheritInverseConfiguration(name = "toProductResponseDTO")
@Mappings({
        @Mapping(target = "category", ignore = true),
        @Mapping(target = "idProduct", ignore = true),
        @Mapping(target = "images", ignore = true),
        @Mapping(target = "idCategory", source = "id_category"),
        @Mapping(source = "product_name", target = "nameProduct"),
})
    Product toProduct(ProductRequestDTO productRequestDTO);
}
