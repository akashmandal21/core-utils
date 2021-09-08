package com.stanzaliving.core.utilservice.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.AllowedStringsValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation validates whether the field value corresponds
 * to given values in array provided.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AllowedStringsValidator.class)
public @interface AllowedStrings {

	String message() default "${validatedValue} does not maps to allowed values";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] values();
}