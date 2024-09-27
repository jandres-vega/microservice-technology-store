package com.store.technology.usermanagementservice.persistence.repositoryImpl;

import com.store.technology.usermanagementservice.domain.dto.request.AddressRequestDTO;
import com.store.technology.usermanagementservice.domain.dto.response.AddressResponseDTO;
import com.store.technology.usermanagementservice.domain.repository.AddressRepository;
import com.store.technology.usermanagementservice.persistence.crud.AddressCrudRepository;
import com.store.technology.usermanagementservice.persistence.entity.Address;
import com.store.technology.usermanagementservice.persistence.mappers.AddressMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepositoryImpl implements AddressRepository {


    private final AddressCrudRepository addressCrudRepository;
    private final AddressMapper addressMapper;

    public AddressRepositoryImpl(AddressCrudRepository addressCrudRepository, AddressMapper addressMapper) {
        this.addressCrudRepository = addressCrudRepository;
        this.addressMapper = addressMapper;
    }

    @Override
    public AddressResponseDTO save(AddressRequestDTO addressRequestDTO) {
        Address addressSaved = addressMapper.toAddress(addressRequestDTO);
        return addressMapper.toAddressResponseDTO(addressCrudRepository.save(addressSaved));
    }
}
