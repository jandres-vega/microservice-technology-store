package com.store.technology.usermanagementservice.persistence.repositoryImpl;

import com.store.technology.usermanagementservice.domain.repository.UserRoleRepository;
import com.store.technology.usermanagementservice.persistence.crud.UserRoleCrudRepository;
import com.store.technology.usermanagementservice.persistence.entity.UserRoles;
import org.springframework.stereotype.Repository;

@Repository
public class UserRoleRepositoryImpl implements UserRoleRepository {

    private final UserRoleCrudRepository userRoleCrudRepository;

    public UserRoleRepositoryImpl(UserRoleCrudRepository userRoleCrudRepository) {
        this.userRoleCrudRepository = userRoleCrudRepository;
    }

    @Override
    public void save(UserRoles userRoles) {
        userRoleCrudRepository.save(userRoles);
    }
}
