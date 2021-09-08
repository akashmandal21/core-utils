package com.stanzaliving.core.utilservice.annotations.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomLengthStringValidator.class)
public @interface ValidCustomLengthString {
    String message() default "String cannot contain empty fields | null | Max length exceeded | Invalid format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int length();
}
