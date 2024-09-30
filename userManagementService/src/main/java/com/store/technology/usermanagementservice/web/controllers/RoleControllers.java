package com.store.technology.usermanagementservice.web.controllers;

import com.store.technology.usermanagementservice.domain.dto.request.RoleRequestDTO;
import com.store.technology.usermanagementservice.domain.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleControllers {

    private final RoleService roleService;

    public RoleControllers(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public ResponseEntity<List<RoleRequestDTO>> getRoles(){
        return ResponseEntity.status(HttpStatus.OK).body(roleService.getRoles());
    }

    @PostMapping("/register")
    public ResponseEntity<RoleRequestDTO> createUser(@RequestBody RoleRequestDTO roleRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(roleService.save(roleRequestDTO));
    }
}
