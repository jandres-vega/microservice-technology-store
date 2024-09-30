package com.store.technology.usermanagementservice.persistence.mappers;

import com.store.technology.usermanagementservice.domain.dto.request.RoleRequestDTO;
import com.store.technology.usermanagementservice.persistence.entity.Role;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mappings({
            @Mapping(target = "idRole", ignore = true),
            @Mapping(target = "name", source = "role_name")
    })
    Role toRole(RoleRequestDTO roleRequestDTO);

    @InheritInverseConfiguration
    RoleRequestDTO toRoleRequestDTO(Role role);

    List<RoleRequestDTO> toRoleRequestDTO(List<Role> roles);
}
