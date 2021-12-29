package com.stanzaliving.core.utilservice.annotations;

import com.stanzaliving.core.utilservice.annotations.validator.DateFormatValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateFormatValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DateFormat {
    String message() default "Invalid Date format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
