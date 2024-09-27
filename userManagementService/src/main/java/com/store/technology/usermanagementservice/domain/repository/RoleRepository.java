package com.store.technology.usermanagementservice.domain.repository;

import com.store.technology.usermanagementservice.domain.dto.request.RoleRequestDTO;
import com.store.technology.usermanagementservice.persistence.entity.Role;
import com.store.technology.usermanagementservice.persistence.enums.TypeRole;


public interface RoleRepository {

    RoleRequestDTO save(RoleRequestDTO roleRequestDTO);

    Role findByName(TypeRole typeRole);
}
