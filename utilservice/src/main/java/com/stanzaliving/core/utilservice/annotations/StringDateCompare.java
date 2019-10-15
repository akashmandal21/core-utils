package com.stanzaliving.core.utilservice.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.StringDateCompareValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = StringDateCompareValidator.class)
public @interface StringDateCompare {

    String message() default "{second} should be later than {first}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String first();

    String second();

    boolean isEqual() default true;
}
