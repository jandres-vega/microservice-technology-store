package com.store.technology.usermanagementservice.persistence.entity;

import com.store.technology.usermanagementservice.persistence.enums.TypeRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_role")
    private String idRole;
    private TypeRole name;
}
