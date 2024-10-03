package com.store.technology.usermanagementservice.domain.client;
import com.store.technology.usermanagementservice.domain.dto.response.AuthCredentialDTO;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "authentication", url = "http://localhost:5000/api/authentication")
public interface AuthServiceClient {

    AuthCredentialDTO registerCredential();
}
