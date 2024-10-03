package com.store.technology.authentication.persistence.mapper;

import com.store.technology.authentication.domain.dto.request.UserCredentialRequestDTO;
import com.store.technology.authentication.domain.dto.response.UserCredentialResponseDTO;
import com.store.technology.authentication.persistence.entity.UserCredentials;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserCredentialMapper {

    @Mappings({
            @Mapping(target ="email", source = "email"),
            @Mapping(target = "passwordHash", source = "password"),
            @Mapping(target = "idUserCredential", source = "idUserCredential")
    })
    UserCredentials toUserCredentials(UserCredentialRequestDTO userCredentialRequestDTO);

    @Mappings({
            @Mapping(target = "idCredential", ignore = true),
            @Mapping(target = "passwordHash", ignore = true),
            @Mapping(target = "email", source = "email"),
            @Mapping(target = "idUserCredential", source = "idUserCredential")
    })
    UserCredentialResponseDTO toUserCredentialResponseDTO(UserCredentials userCredentials);
}
