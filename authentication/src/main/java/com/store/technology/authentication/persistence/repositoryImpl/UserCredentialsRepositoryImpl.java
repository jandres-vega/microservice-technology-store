package com.store.technology.authentication.persistence.repositoryImpl;

import com.store.technology.authentication.domain.repository.UserCredentialsRepository;
import com.store.technology.authentication.persistence.crud.UserCredentialsCrudRepository;
import com.store.technology.authentication.persistence.entity.UserCredentials;
import org.springframework.stereotype.Repository;

@Repository
public class UserCredentialsRepositoryImpl implements UserCredentialsRepository {

    private final UserCredentialsCrudRepository userCredentialsCrudRepository;

    public UserCredentialsRepositoryImpl(UserCredentialsCrudRepository userCredentialsCrudRepository) {
        this.userCredentialsCrudRepository = userCredentialsCrudRepository;
    }

    @Override
    public UserCredentials finById(String email) {
        return userCredentialsCrudRepository.findById(email).orElse(null);
    }
}
