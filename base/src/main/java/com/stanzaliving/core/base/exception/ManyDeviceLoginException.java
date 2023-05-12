package com.stanzaliving.core.base.exception;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ManyDeviceLoginException extends RuntimeException{
    private static final long serialVersionUID = 2383765692199412703L;

    private final String message;

    private final String errorCode;

    public ManyDeviceLoginException(String message) {
        super(message);
        this.message = message;
        this.errorCode = null;
    }

    public ManyDeviceLoginException(String message, String errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }
}
