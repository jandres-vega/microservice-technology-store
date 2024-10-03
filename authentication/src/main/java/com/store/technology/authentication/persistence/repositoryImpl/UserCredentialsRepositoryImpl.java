package com.store.technology.authentication.persistence.repositoryImpl;

import com.store.technology.authentication.domain.dto.request.UserCredentialRequestDTO;
import com.store.technology.authentication.domain.dto.response.UserCredentialResponseDTO;
import com.store.technology.authentication.domain.repository.UserCredentialsRepository;
import com.store.technology.authentication.persistence.crud.UserCredentialsCrudRepository;
import com.store.technology.authentication.persistence.entity.UserCredentials;
import com.store.technology.authentication.persistence.mapper.UserCredentialMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserCredentialsRepositoryImpl implements UserCredentialsRepository {

    private final UserCredentialsCrudRepository userCredentialsCrudRepository;
    private final UserCredentialMapper userCredentialMapper;

    public UserCredentialsRepositoryImpl(UserCredentialsCrudRepository userCredentialsCrudRepository, UserCredentialMapper userCredentialMapper) {
        this.userCredentialsCrudRepository = userCredentialsCrudRepository;
        this.userCredentialMapper = userCredentialMapper;
    }

    @Override
    public UserCredentials finById(String email) {
        return userCredentialsCrudRepository.findById(email).orElse(null);
    }

    @Override
    public UserCredentialResponseDTO save(UserCredentialRequestDTO userCredentialRequestDTO) {
        UserCredentials userCredentials = userCredentialMapper.toUserCredentials(userCredentialRequestDTO);
        return userCredentialMapper.toUserCredentialResponseDTO(userCredentials);
    }
}
