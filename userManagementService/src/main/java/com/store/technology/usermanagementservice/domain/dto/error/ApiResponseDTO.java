package com.store.technology.usermanagementservice.domain.dto.error;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponseDTO {

    private LocalDateTime timestamp = LocalDateTime.now();
    private String message;
    private String url;
    private int status;

    public ApiResponseDTO(String message, String url, int status) {
        this.message = message;
        this.url = url;
        this.status = status;
    }
}
