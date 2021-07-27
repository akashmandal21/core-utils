package com.stanzaliving.core.utilservice.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.PhoneNumberValidator;

@Target(value=ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=PhoneNumberValidator.class)
public @interface ValidPhoneNumber {
	String message() default "invalid mobile number or country code";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    boolean required() default false;
    
}
