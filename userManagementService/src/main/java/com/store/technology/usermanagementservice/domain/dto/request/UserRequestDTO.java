package com.store.technology.usermanagementservice.domain.dto.request;

import lombok.Data;

@Data
public class UserRequestDTO {

    private String user_name;
    private String first_name;
    private String last_name;
    private String email;
    private String password;

}
