package com.stanzaliving.core.base.exception;

import org.springframework.validation.BindingResult;

/**
 *
 * @author Pradeep Naik R
 *
 * @date 30-Oct-2021
 *
 */
public class RequestBindingException extends RuntimeException{

    private BindingResult result;

    public RequestBindingException(String message, BindingResult result) {
        super(message);
        this.result = result;
    }

    public BindingResult getBindingResult() {
        return result;
    }
}
