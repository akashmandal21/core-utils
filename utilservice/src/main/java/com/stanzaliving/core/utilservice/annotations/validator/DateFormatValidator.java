package com.stanzaliving.core.utilservice.annotations.validator;

import com.stanzaliving.core.utilservice.annotations.DateFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;

public class DateFormatValidator implements
        ConstraintValidator<DateFormat, String> {

    private String pattern;

    @Override
    public void initialize(DateFormat constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.pattern);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.parse(value);
            return true;
        } catch (DateTimeParseException | ParseException e) {
            return false;
        }
    }
}
