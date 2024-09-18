package com.store.technology.usermanagementservice.persistence.repositoryImpl;

import com.store.technology.usermanagementservice.domain.dto.request.UserRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.UserResponseDTO;
import com.store.technology.usermanagementservice.domain.repository.UserRepository;
import com.store.technology.usermanagementservice.persistence.crud.UserCrudRepository;
import com.store.technology.usermanagementservice.persistence.entity.User;
import com.store.technology.usermanagementservice.persistence.mappers.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserCrudRepository userCrudRepository;
    private final UserMapper userMapper;

    public UserRepositoryImpl(UserCrudRepository userCrudRepository, UserMapper userMapper) {
        this.userCrudRepository = userCrudRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponseDTO save(UserRequestDTO userRequestDTO) {
        User userSaved = userMapper.toUser(userRequestDTO);
        return userMapper.toUserResponseDTO(userCrudRepository.save(userSaved));
    }
}
