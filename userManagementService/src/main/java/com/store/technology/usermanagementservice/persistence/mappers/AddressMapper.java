package com.store.technology.usermanagementservice.persistence.mappers;

import com.store.technology.usermanagementservice.domain.dto.request.AddressRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.AddressResponseDTO;
import com.store.technology.usermanagementservice.persistence.entity.Address;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    @Mappings({
            @Mapping(target = "city", source = "city"),
            @Mapping(target = "state", source = "region"),
            @Mapping(target = "addressLine1", source = "address_line1"),
            @Mapping(target = "addressLine2", source = "address_line2"),
            @Mapping(target = "postalCode", source = "postal_code"),
            @Mapping(target = "country", source = "country"),
            @Mapping(target = "idUser", source = "id_user"),
            @Mapping(target = "idAddress", ignore = true),
            @Mapping(target = "user", ignore = true),
            @Mapping(target = "default", source = "default_address")
    })
    Address toAddress(AddressRequestDTO addressRequestDTO);

    @Mappings({
            @Mapping(target = "city", source = "city"),
            @Mapping(target = "region", source = "state"),
            @Mapping(target = "address_line1", source = "addressLine1"),
            @Mapping(target = "address_line2", source = "addressLine2"),
            @Mapping(target = "postal_code", source = "postalCode"),
            @Mapping(target = "_default", source = "default")
    })
    AddressResponseDTO toAddressResponseDTO(Address address);
}
