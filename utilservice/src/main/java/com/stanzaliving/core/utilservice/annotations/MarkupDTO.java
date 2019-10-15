package com.stanzaliving.core.utilservice.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.stanzaliving.core.utilservice.annotations.validator.MarkupDTOValidator;

/**
 * To be used on only fields and classes which are of type MarkupDto.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@Constraint(validatedBy = MarkupDTOValidator.class)
public @interface MarkupDTO {

    String message() default OCCUPANCY_NOT_AVAILABLE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    String OCCUPANCY_NOT_AVAILABLE = "Occupancy Is Not Valid";
}
