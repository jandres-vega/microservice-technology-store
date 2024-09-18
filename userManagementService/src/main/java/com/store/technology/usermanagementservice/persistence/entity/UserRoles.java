package com.store.technology.usermanagementservice.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_roles")
@Data
public class UserRoles {

    @EmbeddedId
    private UserRolesPK userRolesPK;

    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_role", insertable = false, updatable = false)
    private Role role;
}
