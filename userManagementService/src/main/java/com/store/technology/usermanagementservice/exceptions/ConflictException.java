package com.store.technology.usermanagementservice.exceptions;

import org.springframework.http.HttpStatus;

public class ConflictException extends BaseException{
    public ConflictException(String resourceName, String resourceFileNme, Object fieldValue, HttpStatus httpStatus) {
        super(resourceName, resourceFileNme, fieldValue, httpStatus);
    }

    public ConflictException(String message, String resourceName) {
        super(String.format(message+ " of %s in the application", resourceName), resourceName, HttpStatus.CONFLICT);
    }
}
