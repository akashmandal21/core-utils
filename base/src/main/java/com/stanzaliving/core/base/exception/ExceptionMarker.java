package com.stanzaliving.core.base.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;

public class ExceptionMarker {

    private String errorCode;
    private HttpStatus httpStatus;
    private String message;

    public ExceptionMarker(String errorCode, HttpStatus httpStatus, String message) {
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}
