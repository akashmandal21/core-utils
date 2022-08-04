package com.stanzaliving.core.utilservice.annotations.validator;

import com.stanzaliving.core.base.exception.StanzaException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomLengthStringValidator implements ConstraintValidator<ValidCustomLengthString, String> {
    @Override
    public void initialize(ValidCustomLengthString constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || value.trim().isEmpty() )
            throw new StanzaException("Value is invalid due to empty | null string");
        else if(value.trim().length() > 50){ //todo: update the length & add valid string start character
            throw new StanzaException("Value is invalid due to string length greater than 50");
        }
        return true;
    }
}
