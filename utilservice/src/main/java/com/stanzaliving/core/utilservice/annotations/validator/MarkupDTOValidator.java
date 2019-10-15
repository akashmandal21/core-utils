package com.stanzaliving.core.utilservice.annotations.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.utilservice.annotations.MarkupDTO;
import com.stanzaliving.core.utilservice.annotations.validator.MarkupDTOValidator.Markup;

public class MarkupDTOValidator implements ConstraintValidator<MarkupDTO, Markup> {
    public void initialize(MarkupDTO constraint) {
    }

    public boolean isValid(Markup obj, ConstraintValidatorContext context) {
        if (obj != null) {
            if (obj.getOccupancyFromUI()) {
                int occupancy = obj.getOccupancy();
                if (occupancy > 100 || occupancy < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static interface Markup {

		Boolean getOccupancyFromUI();

		Integer getOccupancy();
    	
    }
}
