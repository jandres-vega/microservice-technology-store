package com.store.technology.productcatalogservice.persistence.mapper;

import com.store.technology.productcatalogservice.domain.dto.request.ImageRequestDTO;
import com.store.technology.productcatalogservice.persistence.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ImageMapper {

    @Mappings(
            {
                    @Mapping(source = "urlImage", target = "url"),
                    @Mapping(target = "idImage", ignore = true),
                    @Mapping(target = "product", ignore = true),
                    @Mapping(target = "idProduct", source = "product_id")
            })
    Image toImage(ImageRequestDTO imageRequestDTO);
}
