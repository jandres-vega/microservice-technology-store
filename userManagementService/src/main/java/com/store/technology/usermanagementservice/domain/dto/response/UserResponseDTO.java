package com.store.technology.usermanagementservice.domain.dto.response;

import lombok.Data;

@Data
public class UserResponseDTO {

    private String id;
    private String first_name;
    private String last_name;
    private String email;
}
