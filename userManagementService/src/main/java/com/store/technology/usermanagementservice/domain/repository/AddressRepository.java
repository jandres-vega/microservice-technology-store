package com.store.technology.usermanagementservice.domain.repository;

import com.store.technology.usermanagementservice.domain.dto.request.AddressRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.AddressResponseDTO;

public interface AddressRepository {

    AddressResponseDTO save(AddressRequestDTO addressRequestDTO);
}
