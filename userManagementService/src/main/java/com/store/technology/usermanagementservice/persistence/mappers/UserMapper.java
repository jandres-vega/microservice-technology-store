package com.store.technology.usermanagementservice.persistence.mappers;

import com.store.technology.usermanagementservice.domain.dto.request.UserRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.UserResponseDTO;
import com.store.technology.usermanagementservice.persistence.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(target = "idUser", ignore = true),
            @Mapping(target = "userName", source = "user_name"),
            @Mapping(target = "firstName", source = "first_name"),
            @Mapping(target = "lastName", source = "last_name"),
            @Mapping(target = "phone", ignore = true),
            @Mapping(target = "addresses", ignore = true)
    })
    User toUser(UserRequestDTO userRequestDTO);

    @Mappings({
            @Mapping(target = "first_name", source = "firstName"),
            @Mapping(target = "id", source = "idUser"),
            @Mapping(target = "last_name", source = "lastName"),
            @Mapping(target = "email", source = "email")
    })
    UserResponseDTO toUserResponseDTO(User user);

}
