package com.stanzaliving.core.utilservice.annotations.validator;

import com.stanzaliving.core.utilservice.annotations.IsStringOnlyAlphabet;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsStringOnlyAlphabetValidator implements ConstraintValidator<IsStringOnlyAlphabet, String> {
    @Override
    public void initialize(IsStringOnlyAlphabet constraintAnnotation) {
        /**
         * default
         *
         */
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return ((!"".equals(value))
                && (value != null)
                && (value.matches("^[a-zA-Z]*$")));
    }
}
