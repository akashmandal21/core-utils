package com.stanzaliving.core.utilservice.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.DateFormatValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateFormatValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DateFormat {

    String message() default "Invalid Date format";

    String pattern() default "yyyy-dd-MM";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}