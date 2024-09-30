package com.store.technology.authentication.persistence.crud;

import com.store.technology.authentication.persistence.entity.UserCredentials;
import org.springframework.data.repository.CrudRepository;

public interface UserCredentialsCrudRepository extends CrudRepository<UserCredentials, String> {
}
