package com.stanzaliving.core.utilservice.annotations.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.utilservice.annotations.Range;

import java.math.BigDecimal;

public class RangeValidator implements ConstraintValidator<Range, Object> {

	private long max;
	private long min;

	@Override
	public void initialize(Range constraint) {
		max = constraint.max();
		min = constraint.min();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}

		if (value instanceof String) {
			
			try {
				BigDecimal dv = new BigDecimal((String) value);
				return dv.compareTo(BigDecimal.valueOf(min)) >= 0 && dv.compareTo(BigDecimal.valueOf(max)) <= 0;
			} catch (NumberFormatException nfe) {
				return false;
			}
			
		} else if ((value instanceof Double) || (value instanceof Float)) {
			
			double dv = ((Number) value).doubleValue();
			return dv >= min && dv <= max;
			
		} else if (value instanceof Number) {
			
			long lv = ((Number) value).longValue();
			return lv >= min && lv <= max;
			
		} else {
			return false;
		}
	}
}