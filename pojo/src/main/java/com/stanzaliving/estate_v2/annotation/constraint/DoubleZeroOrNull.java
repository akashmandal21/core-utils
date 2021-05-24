package com.stanzaliving.estate_v2.annotation.constraint;

import com.stanzaliving.estate_v2.annotation.validator.DoubleZeroOrNullValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DoubleZeroOrNullValidator.class)
public @interface DoubleZeroOrNull {
    String message() default "Field cannot be zero or null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
