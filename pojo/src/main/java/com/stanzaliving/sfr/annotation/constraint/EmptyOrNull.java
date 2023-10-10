package com.stanzaliving.sfr.annotation.constraint;

import com.stanzaliving.sfr.annotation.validator.EmptyOrNullValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmptyOrNullValidator.class)
public @interface EmptyOrNull {
    String message() default "Field cannot be empty or null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
