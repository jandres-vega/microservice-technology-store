package com.store.technology.authentication.domain.repository;

import com.store.technology.authentication.persistence.entity.UserCredentials;

public interface UserCredentialsRepository {

    UserCredentials finById(String email, String password);
}
