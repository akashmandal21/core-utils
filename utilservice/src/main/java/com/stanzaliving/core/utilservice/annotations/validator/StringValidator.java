package com.stanzaliving.core.utilservice.annotations.validator;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.utilservice.annotations.ValidString;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class StringValidator implements ConstraintValidator<ValidString, String> {

    @Override
    public void initialize(ValidString constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || value.trim().isEmpty() )
            throw new StanzaException("Value is invalid due to empty | null string");
        else if(value.trim().length() > 50){
            throw new StanzaException("Value is invalid due to string length greater than 50");
        }
        return true;
    }
}
