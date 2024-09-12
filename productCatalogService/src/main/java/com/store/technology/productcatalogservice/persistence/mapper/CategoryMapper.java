package com.store.technology.productcatalogservice.persistence.mapper;

import com.store.technology.productcatalogservice.domain.dto.CategoryDTO;
import com.store.technology.productcatalogservice.persistence.entity.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(target = "idCategory", source = "categoryId"),
            @Mapping(target = "nameCategory", source = "categoryName"),
            @Mapping(target = "description", source = "description")
    })
    CategoryDTO toCategory(Category category);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    Category toCategoryDTO(CategoryDTO categoryDTO);
}
