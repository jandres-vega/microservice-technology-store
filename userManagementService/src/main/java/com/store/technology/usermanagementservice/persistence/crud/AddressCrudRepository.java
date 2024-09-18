package com.store.technology.usermanagementservice.persistence.crud;

import com.store.technology.usermanagementservice.persistence.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressCrudRepository extends CrudRepository<Address, String> { }
