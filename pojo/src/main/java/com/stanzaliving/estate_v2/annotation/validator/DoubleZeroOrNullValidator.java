package com.stanzaliving.estate_v2.annotation.validator;

import com.stanzaliving.estate_v2.annotation.constraint.DoubleZeroOrNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DoubleZeroOrNullValidator implements ConstraintValidator<DoubleZeroOrNull, Double> {


    @Override
    public boolean isValid(Double value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && !value.equals(0.0);
    }


}
