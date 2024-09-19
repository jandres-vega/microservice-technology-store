package com.store.technology.usermanagementservice.web.controllers;

import com.store.technology.usermanagementservice.domain.dto.request.UserRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.UserResponseDTO;
import com.store.technology.usermanagementservice.domain.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserControllers {

    private final UserService userService;

    public UserControllers(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userRequestDTO) {
        System.out.println("UserRequestDTO: " + userRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userRequestDTO));
    }
}
