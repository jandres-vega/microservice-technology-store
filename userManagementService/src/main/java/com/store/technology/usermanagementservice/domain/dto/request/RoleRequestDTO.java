package com.store.technology.usermanagementservice.domain.dto.request;

import com.store.technology.usermanagementservice.persistence.enums.TypeRole;
import lombok.Data;

@Data
public class RoleRequestDTO {

    private TypeRole role_name;
}
