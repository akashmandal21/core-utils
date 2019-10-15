package com.stanzaliving.core.utilservice.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.ValidLocalDateValidator;

/**
 * Check for validity of date for LocalDate only.
 * min and maximum year are validated from today.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE_USE})
@Constraint(validatedBy = ValidLocalDateValidator.class)
public @interface ValidLocalDate {

    String message() default "Invalid Date";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int minyear() default MIN_YEAR_IN_PAST;

    int maxyear() default MAX_YEAR_IN_FUTURE;
    
    int MAX_YEAR_IN_FUTURE = 30;
	int MIN_YEAR_IN_PAST = -10;
}
