package com.store.technology.usermanagementservice.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class UserRolesPK implements Serializable {
    @Column(name = "id_user")
    private String idUser;
    @Column(name = "id_role")
    private String idRole;
}
