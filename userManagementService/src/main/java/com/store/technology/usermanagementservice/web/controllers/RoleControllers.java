package com.store.technology.usermanagementservice.web.controllers;

import com.store.technology.usermanagementservice.domain.dto.request.RoleRequestDTO;
import com.store.technology.usermanagementservice.domain.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public class RoleControllers {

    private final RoleService roleService;

    public RoleControllers(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping("/register")
    public ResponseEntity<RoleRequestDTO> createUser(@RequestBody RoleRequestDTO roleRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(roleService.save(roleRequestDTO));
    }
}
