package com.store.technology.authentication.domain.repository;

import com.store.technology.authentication.domain.dto.request.UserCredentialRequestDTO;
import com.store.technology.authentication.domain.dto.response.UserCredentialResponseDTO;
import com.store.technology.authentication.persistence.entity.UserCredentials;

public interface UserCredentialsRepository {

    UserCredentials finById(String email);

    UserCredentialResponseDTO save(UserCredentialRequestDTO userCredentialRequestDTO);

}
