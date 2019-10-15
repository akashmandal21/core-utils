package com.stanzaliving.core.utilservice.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.FutureDateValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD})
@Constraint(validatedBy = FutureDateValidator.class)
public @interface NotPast {
    String message() default "{fieldName} should not be in the past";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    String fieldName() default "Date";

    boolean isEqual() default true;
}
