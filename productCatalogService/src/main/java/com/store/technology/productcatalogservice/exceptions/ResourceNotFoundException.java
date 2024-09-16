package com.store.technology.productcatalogservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends BaseException {

    public ResourceNotFoundException(String resourceName, String resourceFileNme, Object fieldValue, HttpStatus httpStatus) {
        super(resourceName, resourceFileNme, fieldValue, httpStatus);
    }

    public ResourceNotFoundException(String message, String resourceName, HttpStatus httpStatus) {
        super(String.format("Register not found of %s in the application", resourceName), resourceName, HttpStatus.NOT_FOUND);
    }
}
