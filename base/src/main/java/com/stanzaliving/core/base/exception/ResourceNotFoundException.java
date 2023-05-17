package com.stanzaliving.core.base.exception;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3368655266237942369L;

    private final String message;

    private final String errorCode;

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
        this.errorCode = null;
    }

    public ResourceNotFoundException(String message, String errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }
}
