package com.stanzaliving.core.utilservice.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.ValueCompareValidator;

/**
 * Compare two values in an object for
 * Supported data types integer only
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = ValueCompareValidator.class)
@Repeatable(ValueCompares.class)
public @interface ValueCompare {

    String message() default "{second} should be more than {first}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String first();

    String second();

    boolean isEqual() default true;
}
