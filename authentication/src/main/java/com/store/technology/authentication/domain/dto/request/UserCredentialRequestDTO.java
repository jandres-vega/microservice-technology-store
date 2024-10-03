package com.store.technology.authentication.domain.dto.request;

import lombok.Data;

@Data
public class UserCredentialRequestDTO {

    private String email;
    private String password;
    private String idUserCredential;

}
