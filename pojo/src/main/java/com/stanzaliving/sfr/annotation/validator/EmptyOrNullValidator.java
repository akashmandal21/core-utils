package com.stanzaliving.sfr.annotation.validator;

import com.stanzaliving.sfr.annotation.constraint.EmptyOrNull;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmptyOrNullValidator implements ConstraintValidator<EmptyOrNull, String> {

    @Override
    public boolean isValid(String field, ConstraintValidatorContext constraintValidatorContext) {
        return !StringUtils.isEmpty(field);
    }
}
