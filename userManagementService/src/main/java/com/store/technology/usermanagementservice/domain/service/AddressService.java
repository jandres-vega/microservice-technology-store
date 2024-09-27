package com.store.technology.usermanagementservice.domain.service;

import com.store.technology.usermanagementservice.domain.dto.request.AddressRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.AddressResponseDTO;
import com.store.technology.usermanagementservice.domain.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public AddressResponseDTO saveAddress(AddressRequestDTO addressRequestDTO) {
        return addressRepository.save(addressRequestDTO);
    }
}
