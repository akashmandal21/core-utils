package com.stanzaliving.core.base.exception;

public enum ExceptionMarker {

     DS001("Shortage submission failed "),
     DS002("Leftover submission failed "),
     DS003("No Data found"),
     DS004("No dispatched meal details found to initiate"),
     DS005("No Food dispatched meal details found");

    private String message;

    ExceptionMarker(String message) {
        this.message = message;
    }

    public ApiValidationException getApiValidationException() {
        ApiValidationException apiValidationException = new ApiValidationException(this.message, this.name());
        return apiValidationException;
    }
}
