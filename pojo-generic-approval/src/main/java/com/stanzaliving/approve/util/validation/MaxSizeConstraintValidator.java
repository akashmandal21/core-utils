package com.stanzaliving.approve.util.validation;

import com.stanzaliving.approve.dto.mail_template.MailConfigurationDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class MaxSizeConstraintValidator implements ConstraintValidator<MaxSizeConstraint, List<MailConfigurationDto>> {

    @Override
    public boolean isValid(List<MailConfigurationDto> value, ConstraintValidatorContext context) {
        if(value == null) return true;
        else return value.size() <= 2 ;
    }

}
