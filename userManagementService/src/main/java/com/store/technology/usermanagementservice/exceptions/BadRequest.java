package com.store.technology.usermanagementservice.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequest extends BaseException{
    public BadRequest(String resourceName, String resourceFileNme, Object fieldValue, HttpStatus httpStatus) {
        super(resourceName, resourceFileNme, fieldValue, httpStatus);
    }

    public BadRequest(String message, String resourceName, HttpStatus httpStatus) {
        super(message, resourceName, httpStatus);
    }
}
