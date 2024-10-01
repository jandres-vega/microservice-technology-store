package com.store.technology.authentication.domain.dto;

import com.store.technology.authentication.persistence.enums.TypeRole;
import lombok.Data;

@Data
public class RoleDTO {

    private TypeRole role_name;
}
