package com.stanzaliving.ledger.annotation.constraint;

import com.stanzaliving.ledger.annotation.validator.ZeroOrNullValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ZeroOrNullValidator.class)
public @interface NotZeroOrNull {
    String message() default "Field cannot be zero or null";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
