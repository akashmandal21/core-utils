package com.stanzaliving.core.utilservice.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.BothNotNullValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = BothNotNullValidator.class)
public @interface BothNotNull {
	String message() default "Please provide atleast one among {first} or {second}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String first();

	String second();

	boolean isEqual() default true;
}
