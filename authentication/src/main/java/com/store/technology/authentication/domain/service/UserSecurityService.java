package com.store.technology.authentication.domain.service;

import com.store.technology.authentication.domain.client.UserServiceClient;
import com.store.technology.authentication.domain.repository.UserCredentialsRepository;
import com.store.technology.authentication.persistence.entity.UserCredentials;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService {

    private final UserServiceClient userServiceClient;
    private final UserCredentialsRepository userCredentialsRepository;

    public UserSecurityService(UserServiceClient userServiceClient, UserCredentialsRepository userCredentialsRepository) {
        this.userServiceClient = userServiceClient;
        this.userCredentialsRepository = userCredentialsRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserCredentials userFInd = userCredentialsRepository.finById(email);

        String[] rolesArray = userServiceClient.getRoles()
                .stream()
                .map(role -> role.getRole_name().toString())
                .toArray(String[]::new);

        return User.builder()
                .username(userFInd.getEmail())
                .password(userFInd.getPasswordHash())
                .authorities(rolesArray)
                .build();
    }
}
