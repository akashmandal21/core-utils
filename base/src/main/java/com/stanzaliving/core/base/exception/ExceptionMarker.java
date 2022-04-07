package com.stanzaliving.core.base.exception;

public class ExceptionMarker {

    private String errorCode;
    private String message;

    public ExceptionMarker(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
