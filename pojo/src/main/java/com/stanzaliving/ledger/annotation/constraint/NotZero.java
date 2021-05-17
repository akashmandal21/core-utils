package com.stanzaliving.ledger.annotation.constraint;

import com.stanzaliving.ledger.annotation.validator.NotZeroValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotZeroValidator.class)
public @interface NotZero {
    String message() default "Amount cannot be zero";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
