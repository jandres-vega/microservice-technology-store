package com.store.technology.productcatalogservice.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequestException extends BaseException{
    public BadRequestException(String resourceName, String resourceFileNme, Object fieldValue, HttpStatus httpStatus) {
        super(resourceName, resourceFileNme, fieldValue, httpStatus);
    }

    public BadRequestException(String message, String resourceName, HttpStatus httpStatus) {
        super(message, resourceName, httpStatus);
    }
}
