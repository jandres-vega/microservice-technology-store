package com.store.technology.authentication.domain.dto;

import lombok.Data;

@Data
public class LoginDTO {
    private String email;
    private String password;
}
