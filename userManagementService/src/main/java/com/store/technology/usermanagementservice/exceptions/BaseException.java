package com.store.technology.usermanagementservice.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseException extends RuntimeException{

    private final String resourceName;
    private String resourceFileNme;
    private Object fieldValue;
    private final HttpStatus httpStatus;

    public BaseException(String resourceName, String resourceFileNme, Object fieldValue, HttpStatus httpStatus) {
        super(String.format("%s not found with %s : '%s'", resourceName, resourceFileNme, fieldValue));
        this.resourceName = resourceName;
        this.resourceFileNme = resourceFileNme;
        this.fieldValue = fieldValue;
        this.httpStatus = httpStatus;
    }

    public BaseException(String message, String resourceName, HttpStatus httpStatus) {
        super(message);
        this.resourceName = resourceName;
        this.httpStatus = httpStatus;
    }
}
