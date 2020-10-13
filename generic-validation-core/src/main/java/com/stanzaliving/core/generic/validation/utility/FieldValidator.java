package com.stanzaliving.core.generic.validation.utility;

import com.stanzaliving.core.generic.validation.dtos.UiField;
import com.stanzaliving.core.generic.validation.enums.Validator;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

@UtilityClass
@Log4j2
public class FieldValidator {

    public boolean validateFieldValueUsingValidator(Validator validator, String regex, Object value, UiField uiField){
        boolean regexMatch = true;

        if(StringUtils.isNotEmpty(regex) && value instanceof String)
            regexMatch = ((String)value).matches(regex);
        if(!regexMatch)
        {
            log.info("Validation failed using Regex {} {} {} {}",regex,validator,value,uiField.getDefaultErrorMsgValidation());
            uiField.setErrorMsg(uiField.getDefaultErrorMsgValidation());
            return false;
        }
        String err = null;
        switch (validator){
            case PINCODE:
                if(((String)value).length()!=6)
                    err = "Pin code length shall not exceed 6 digits.";
                break;

            case MOBILE:
                if(((String)value).length()!=10)
                    err = "Mobile number length shall not exceed 10 digits.";
                break;

            default:
                log.error("Validator {} Not found for field {}",validator, uiField.getFieldName());
                return true;
        }
        if(Objects.nonNull(err))
        {
            uiField.setErrorMsg(err);
            return false;
        }
        return true;
    }
}
