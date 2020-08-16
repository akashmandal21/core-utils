package com.stanzaliving.core.generic.validation.utility;

import com.stanzaliving.core.generic.validation.dtos.UiField;
import com.stanzaliving.core.generic.validation.enums.Validator;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

@UtilityClass
public class FieldValidator {

    public void validateFieldValueUsingValidator(Validator validator, String regex, Object value, UiField uiField){
        boolean regexMatch = true;

        if(StringUtils.isNotEmpty(regex) && value instanceof String)
            regexMatch = ((String)value).matches(regex);
        if(!regexMatch)
        {
            uiField.setErrorMsg(uiField.getDefaultErrorMsgValidation());
            return ;
        }

        switch (validator){
            case PINCODE:
                if(((String)value).length()!=6)
                    uiField.setErrorMsg("Pin code length shall not exceed 6 digits.");

            case MOBILE:
                if(((String)value).length()!=10)
                    uiField.setErrorMsg("Mobile number length shall not exceed 10 digits.");

            default:
                return;
        }
    }
}
