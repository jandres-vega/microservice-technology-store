package com.store.technology.usermanagementservice.exceptions;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends BaseException {


    public ResourceNotFoundException(String resourceName, String resourceFileNme, Object fieldValue, HttpStatus httpStatus) {
        super(resourceName, resourceFileNme, fieldValue, httpStatus);
    }

    public ResourceNotFoundException(String message, String resourceName) {
        super(String.format("Register not found of %s in the application", resourceName), resourceName, HttpStatus.NOT_FOUND);
    }
}
