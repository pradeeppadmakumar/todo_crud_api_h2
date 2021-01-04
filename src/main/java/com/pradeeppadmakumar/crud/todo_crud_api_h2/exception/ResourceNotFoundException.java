package com.pradeeppadmakumar.crud.todo_crud_api_h2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
