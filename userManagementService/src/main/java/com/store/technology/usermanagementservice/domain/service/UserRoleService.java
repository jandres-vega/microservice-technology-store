package com.store.technology.usermanagementservice.domain.service;

import com.store.technology.usermanagementservice.domain.repository.UserRoleRepository;
import com.store.technology.usermanagementservice.persistence.entity.UserRoles;
import com.store.technology.usermanagementservice.persistence.entity.UserRolesPK;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public void assignRoleToUser(String idUser, String idRole) {
        UserRoles newUserRoles = new UserRoles();
        UserRolesPK userRolesPK = new UserRolesPK();
        userRolesPK.setIdUser(idUser);
        userRolesPK.setIdRole(idRole);
        newUserRoles.setUserRolesPK(userRolesPK);
        userRoleRepository.save(newUserRoles);
    }
}
