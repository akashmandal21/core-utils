package com.stanzaliving.approve.util.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy = MaxSizeConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MaxSizeConstraint {
    String message() default "";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
