package com.stanzaliving.core.utilservice.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.HourCompareValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation compares two hours in an object.
 * start: name of the field containing start hour
 * end: name of the field containing end hour
 * accepted data type: int
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = HourCompareValidator.class)
public @interface HourCompare {

	String message() default "{start} and {end} are not valid";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String start();

	String end();
}