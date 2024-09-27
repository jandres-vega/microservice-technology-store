package com.store.technology.usermanagementservice.web.controllers;

import com.store.technology.usermanagementservice.domain.dto.request.AddressRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.AddressResponseDTO;
import com.store.technology.usermanagementservice.domain.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/save")
    public ResponseEntity<AddressResponseDTO> saveAddress(@RequestBody AddressRequestDTO addressRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(addressService.saveAddress(addressRequestDTO));
    }
}
