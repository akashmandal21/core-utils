package com.stanzaliving.core.utilservice.annotations.validator;

import java.lang.reflect.Field;
import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.utilservice.annotations.StringDateCompare;
import com.stanzaliving.core.utilservice.utils.ReflectionUtils;

/**
 * Extending the functionality of Date Validator to validate Strings.
 */
public class StringDateCompareValidator implements ConstraintValidator<StringDateCompare, Object> {

    private String firstField;
    private String secondField;
    private boolean isEqual;

    @Override
    public void initialize(StringDateCompare constraint) {
        firstField = constraint.first();
        secondField = constraint.second();
        isEqual = constraint.isEqual();
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        try {
            Class<?> clazz = obj.getClass();
            Field field1 = ReflectionUtils.findField(clazz, firstField);
            ReflectionUtils.makeAccessible(field1);
            Field field2 = ReflectionUtils.findField(clazz, secondField);
            ReflectionUtils.makeAccessible(field2);
            String firstDate = (String) field1.get(obj);
            String secondDate = (String) field2.get(obj);
            LocalDate fromDate = LocalDate.parse(firstDate);
            LocalDate toDate = LocalDate.parse(secondDate);

            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate()).addPropertyNode(secondField).addConstraintViolation();
            if (fromDate != null && toDate != null) {
                if (!isEqual && !fromDate.isEqual(toDate)) {
                    return fromDate.isBefore(toDate);
                } else if (isEqual && (fromDate.isBefore(toDate) || fromDate.isEqual(toDate))) {
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
        }
        return true;
    }
}
