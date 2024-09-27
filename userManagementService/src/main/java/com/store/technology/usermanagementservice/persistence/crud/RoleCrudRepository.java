package com.store.technology.usermanagementservice.persistence.crud;

import com.store.technology.usermanagementservice.persistence.entity.Role;
import com.store.technology.usermanagementservice.persistence.enums.TypeRole;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleCrudRepository extends CrudRepository<Role, String> {
    Role findByName(TypeRole typeRole);
}
