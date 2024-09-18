package com.store.technology.usermanagementservice.domain.repository;

import com.store.technology.usermanagementservice.domain.dto.request.UserRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.UserResponseDTO;

public interface UserRepository {

    UserResponseDTO save(UserRequestDTO userRequestDTO);
}
