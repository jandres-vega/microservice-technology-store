package com.store.technology.authentication.domain.service;

import com.store.technology.authentication.domain.dto.request.UserCredentialRequestDTO;
import com.store.technology.authentication.domain.dto.response.UserCredentialResponseDTO;
import com.store.technology.authentication.domain.repository.UserCredentialsRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialService {

    private final UserCredentialsRepository userCredentialsRepository;

    public UserCredentialService(UserCredentialsRepository userCredentialsRepository) {
        this.userCredentialsRepository = userCredentialsRepository;
    }

    public UserCredentialResponseDTO saveCredentials(UserCredentialRequestDTO userCredentialRequestDTO) {
        return userCredentialsRepository.save(userCredentialRequestDTO);
    }
}
