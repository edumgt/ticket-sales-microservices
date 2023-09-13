package com.krimo.event_command.exception;

import org.springframework.http.HttpStatus;

public class ApiRequestException extends RuntimeException{
    private final HttpStatus status;

    public ApiRequestException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
