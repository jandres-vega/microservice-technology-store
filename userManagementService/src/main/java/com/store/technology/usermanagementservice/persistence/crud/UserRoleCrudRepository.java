package com.store.technology.usermanagementservice.persistence.crud;

import com.store.technology.usermanagementservice.persistence.entity.UserRoles;
import com.store.technology.usermanagementservice.persistence.entity.UserRolesPK;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleCrudRepository extends CrudRepository<UserRoles, UserRolesPK> { }
