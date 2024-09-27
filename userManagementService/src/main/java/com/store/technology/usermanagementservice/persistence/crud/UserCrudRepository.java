package com.store.technology.usermanagementservice.persistence.crud;

import com.store.technology.usermanagementservice.persistence.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, String> {

    boolean existsUserByUserNameAndEmail(String userName, String email);
}
