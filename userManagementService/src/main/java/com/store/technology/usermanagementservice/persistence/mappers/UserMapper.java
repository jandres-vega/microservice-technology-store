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
            @Mapping(source = "idUser", target = "id"),
            @Mapping(source = "userName", target = "user_name"),
            @Mapping(source = "email", target = "email"),
    })
    UserResponseDTO toUserResponseDTO(User user);

    @InheritInverseConfiguration(name = "toUserResponseDTO")
    User toUser(UserRequestDTO userRequestDTO);
}
