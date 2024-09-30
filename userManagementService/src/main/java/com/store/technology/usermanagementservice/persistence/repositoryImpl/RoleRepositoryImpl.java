package com.store.technology.usermanagementservice.persistence.repositoryImpl;

import com.store.technology.usermanagementservice.domain.dto.request.RoleRequestDTO;
import com.store.technology.usermanagementservice.domain.repository.RoleRepository;
import com.store.technology.usermanagementservice.persistence.crud.RoleCrudRepository;
import com.store.technology.usermanagementservice.persistence.entity.Role;
import com.store.technology.usermanagementservice.persistence.enums.TypeRole;
import com.store.technology.usermanagementservice.persistence.mappers.RoleMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class RoleRepositoryImpl implements RoleRepository {

    private final RoleCrudRepository roleCrudRepository;
    private final RoleMapper roleMapper;

    public RoleRepositoryImpl(RoleCrudRepository roleCrudRepository, RoleMapper roleMapper) {
        this.roleCrudRepository = roleCrudRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public RoleRequestDTO save(RoleRequestDTO roleRequestDTO) {
        Role role = roleMapper.toRole(roleRequestDTO);
        return roleMapper.toRoleRequestDTO(roleCrudRepository.save(role));
    }

    @Override
    public Role findByName(TypeRole typeRole) {
        return roleCrudRepository.findByName(typeRole);
    }

    @Override
    public List<RoleRequestDTO> getRoles() {
        List<Role> rolesFind = (List<Role>) roleCrudRepository.findAll();
        return roleMapper.toRoleRequestDTO(rolesFind);
    }
}
