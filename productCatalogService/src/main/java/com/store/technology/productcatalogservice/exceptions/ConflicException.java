package com.store.technology.productcatalogservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ConflicException extends BaseException {

    public ConflicException(String resourceName, String resourceFileNme, Object fieldValue, HttpStatus httpStatus) {
        super(resourceName, resourceFileNme, fieldValue, httpStatus);
    }

    public ConflicException(String message, String resourceName, HttpStatus httpStatus) {
        super(String.format("Register already exists of %s in the application", resourceName), resourceName, HttpStatus.CONFLICT);
    }
}
