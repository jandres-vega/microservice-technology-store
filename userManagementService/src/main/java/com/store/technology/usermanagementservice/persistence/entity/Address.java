package com.store.technology.usermanagementservice.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "addresses")
@Data
public class Address {

    @Id
    @Column(name = "id_address")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idAddress;
    private String city;
    private String state;
    @Column(name = "address_line1")
    private String addressLine1;
    @Column(name = "address_line2")
    private String addressLine2;
    @Column(name = "postal_code")
    private String postalCode;
    private String country;
    @Column(name = "is_default")
    private boolean isDefault;
    @Column(name = "id_user")
    private String idUser;
    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;
}
