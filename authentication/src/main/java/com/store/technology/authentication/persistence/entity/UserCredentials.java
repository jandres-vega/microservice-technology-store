package com.store.technology.authentication.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_credentials")
@Data
public class UserCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_credential")
    private String idCredential;
    private String email;
    @Column(name = "password_hash")
    private String passwordHash;
    @Column(name = "password_salt")
    private String passwordSalt;
    @Column(name = "two_factor_secret")
    private String twoFactorSecret;
    @Column(name = "is_activated")
    private Boolean isActivated;
    @Column(name = "id_user_credential")
    private String idUserCredential;
    @OneToOne(mappedBy = "userCredentials")
    private RefreshToken refreshToken;

}
