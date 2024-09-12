package com.store.technology.productcatalogservice.persistence.mapper;

import com.store.technology.productcatalogservice.domain.dto.request.CategoryRequestDTO;
import com.store.technology.productcatalogservice.domain.dto.response.CategoryResponseDTO;
import com.store.technology.productcatalogservice.persistence.entity.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "nameCategory", target = "category"),
            @Mapping(source = "description", target = "description"),
    })
    CategoryRequestDTO toCategoryRequestDTO(Category category);

    @Mappings({
            @Mapping(source = "idCategory", target = "id"),
            @Mapping(source = "nameCategory", target = "category"),
            @Mapping(source = "description", target = "description"),
    })
    CategoryResponseDTO toCategoryResponseDTO(Category category);

    List<CategoryResponseDTO> toCategoryResponseDTO(List<Category> categories);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    Category toCategory(CategoryRequestDTO categoryRequestDTO);
}
