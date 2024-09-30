package com.store.technology.authentication.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "refresh_tokens")
@Data
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_refresh_token")
    private String idRefreshToken;

    private String token;
    @Column(name = "expires_at")
    private LocalDateTime expiresAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "id_user_credentials")
    private String idUserCredentials;
    @OneToOne
    @JoinColumn(name = "id_user_credential")
    private UserCredentials userCredentials;
}
