package com.store.technology.usermanagementservice.domain.service;

import com.store.technology.usermanagementservice.domain.dto.request.UserRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.UserResponseDTO;
import com.store.technology.usermanagementservice.domain.repository.UserRepository;
import com.store.technology.usermanagementservice.exceptions.ConflictException;
import com.store.technology.usermanagementservice.persistence.entity.Role;
import com.store.technology.usermanagementservice.persistence.enums.TypeRole;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;
    private final UserRoleService userRoleService;

    public UserService(UserRepository userRepository, RoleService roleService, UserRoleService userRoleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
        this.userRoleService = userRoleService;
    }

    public UserResponseDTO save(UserRequestDTO userRequestDTO) {
        boolean isUserExists = userRepository.isUserExists(userRequestDTO.getUser_name(), userRequestDTO.getEmail());
        if (isUserExists) {
            throw new ConflictException("User already exists", "User");
        }
        UserResponseDTO userResponseDTO = userRepository.save(userRequestDTO);
        Role role = roleService.findByName(TypeRole.USER);
        userRoleService.assignRoleToUser(userResponseDTO.getId(), role.getIdRole());
        return userResponseDTO;
    }
}
