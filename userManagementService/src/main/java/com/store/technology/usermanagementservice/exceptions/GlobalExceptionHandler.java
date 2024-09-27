package com.store.technology.usermanagementservice.exceptions;

import com.store.technology.usermanagementservice.domain.dto.error.ApiResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request) {

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(err -> {
            if (err.getDefaultMessage() != null) {
                String errMsg = err.getDefaultMessage();
                String field = err.getObjectName();
                errors.put(field, errMsg);
            }
        });
        ApiResponseDTO responseDTO = new ApiResponseDTO(errors.toString(), request.getDescription(false), HttpStatus.BAD_REQUEST.value());
        return  new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ApiResponseDTO> handleBaseException(BaseException ex, WebRequest request) {
        String requestDescription = request.getDescription(false);

        ApiResponseDTO response = new ApiResponseDTO(
                ex.getMessage(),
                requestDescription,
                ex.getHttpStatus().value()
        );

        return new ResponseEntity<>(response, ex.getHttpStatus());

    }
}
