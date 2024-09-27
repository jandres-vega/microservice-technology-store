package com.store.technology.usermanagementservice.domain.dto.request;

import lombok.Data;

@Data
public class AddressRequestDTO {

    private String city;
    private String region;
    private String address_line1;
    private String address_line2;
    private String postal_code;
    private String country;
    private boolean default_address;
    private String id_user;
}
