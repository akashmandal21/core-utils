package com.stanzaliving.core.utilservice.annotations;

import com.stanzaliving.core.utilservice.annotations.validator.NotEmptyFieldsValidator;
import com.stanzaliving.core.utilservice.annotations.validator.StringValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StringValidator.class)
public @interface ValidString {
    String message() default "String cannot contain empty fields | null | Max length is 50 character | Invalid format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
