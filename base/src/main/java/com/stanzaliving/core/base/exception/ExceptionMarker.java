package com.stanzaliving.core.base.exception;

import org.springframework.http.HttpStatus;

public abstract class ExceptionMarker {

    private final String message;
    private final String errorCode;
    private final HttpStatus httpStatus;

    public ExceptionMarker(String errorCode, HttpStatus httpStatus, String message) {
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
