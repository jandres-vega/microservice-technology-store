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
            @Mapping(target = "description", source = "description"),
            @Mapping(target = "categoryName", source = "nameCategory")
    })
    /*Return DTO*/
    CategoryDTO toCategoryDTO(Category category);

    /*Return entity*/
    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    Category toCategory(CategoryDTO categoryDTO);
}
