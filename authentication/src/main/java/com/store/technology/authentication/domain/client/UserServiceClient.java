package com.store.technology.authentication.domain.client;

import com.store.technology.authentication.domain.dto.RoleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "userManagementService", url = "http://localhost:3002/api/usermanagementservice")
public interface UserServiceClient {

    @GetMapping("/role/roles")
    List<RoleDTO> getRoles();
}
