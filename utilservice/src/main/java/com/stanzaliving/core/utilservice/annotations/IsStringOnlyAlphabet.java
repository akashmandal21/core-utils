package com.stanzaliving.core.utilservice.annotations;

import com.stanzaliving.core.utilservice.annotations.validator.EmailValidator;
import com.stanzaliving.core.utilservice.annotations.validator.IsStringOnlyAlphabetValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsStringOnlyAlphabetValidator.class)
public @interface IsStringOnlyAlphabet {

    String message() default "Invalid String";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
