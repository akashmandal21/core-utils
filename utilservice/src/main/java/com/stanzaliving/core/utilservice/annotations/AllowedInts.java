package com.stanzaliving.core.utilservice.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.AllowedIntsValidator;

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
@Constraint(validatedBy = AllowedIntsValidator.class)
public @interface AllowedInts {

	String message() default "${validatedValue} is not allowed as {fieldName}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	int[] value();

	String fieldName();
}