package com.stanzaliving.core.utilservice.annotations;

import com.stanzaliving.core.utilservice.annotations.validator.NotEmptyFieldsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotEmptyFieldsValidator.class)
public @interface AllowedStringList {
    String message() default "List cannot contain empty fields | null | Max length is 50 character";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
