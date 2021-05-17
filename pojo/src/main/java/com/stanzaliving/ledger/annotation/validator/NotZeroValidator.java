package com.stanzaliving.ledger.annotation.validator;

import com.stanzaliving.ledger.annotation.constraint.NotZero;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotZeroValidator implements ConstraintValidator<NotZero, Double> {


    @Override
    public boolean isValid(Double amount, ConstraintValidatorContext constraintValidatorContext) {
        return !(amount.equals(0.0));
    }
}
