package com.stanzaliving.core.utilservice.annotations.validator;

import com.stanzaliving.core.utilservice.annotations.DateFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;

public class DateFormatValidator implements
        ConstraintValidator<DateFormat, String> {

    @Override
    public void initialize(DateFormat constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            new SimpleDateFormat("yyyy-dd-MM").parse(value);
            return true;
        } catch (DateTimeParseException | ParseException e) {
            return false;
        }
    }
}
