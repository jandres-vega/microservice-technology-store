package com.store.technology.authentication.web.controllers;

import com.store.technology.authentication.domain.dto.request.UserCredentialRequestDTO;
import com.store.technology.authentication.domain.dto.response.UserCredentialResponseDTO;
import com.store.technology.authentication.domain.service.UserCredentialService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-credentials")
public class UserCredentialController {

    private final UserCredentialService userCredentialService;

    public UserCredentialController(UserCredentialService userCredentialService) {
        this.userCredentialService = userCredentialService;
    }

    @PostMapping("/save")
    public ResponseEntity<UserCredentialResponseDTO> saveCredentials(UserCredentialRequestDTO userCredentialRequestDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(userCredentialService.saveCredentials(userCredentialRequestDTO));
    }
}
