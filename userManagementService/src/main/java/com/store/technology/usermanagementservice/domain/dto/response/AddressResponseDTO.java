package com.store.technology.usermanagementservice.domain.dto.response;

import lombok.Data;

@Data
public class AddressResponseDTO {

    private String city;
    private String region;
    private String address_line1;
    private String address_line2;
    private String postal_code;
    private boolean _default;
}
