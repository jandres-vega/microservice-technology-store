package com.store.technology.usermanagementservice.domain.service;

import com.store.technology.usermanagementservice.domain.dto.request.RoleRequestDTO;
import com.store.technology.usermanagementservice.domain.repository.RoleRepository;
import com.store.technology.usermanagementservice.exceptions.ConflictException;
import com.store.technology.usermanagementservice.persistence.entity.Role;
import com.store.technology.usermanagementservice.persistence.enums.TypeRole;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public RoleRequestDTO save(RoleRequestDTO roleRequestDTO) {
        Role roleFind = this.findByName(roleRequestDTO.getRole_name());
        if(roleFind == null){
            return roleRepository.save(roleRequestDTO);
        }else {
            throw new ConflictException("El role ya se encuentra registrado", "Role");
        }
    }

    public Role findByName(TypeRole typeRole) {
        return roleRepository.findByName(typeRole);
    }

}
