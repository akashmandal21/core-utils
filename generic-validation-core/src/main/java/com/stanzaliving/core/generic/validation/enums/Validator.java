package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Validator {

    REGEX(null,null),
    ALPHANUMERIC("Valid characters and Numbers only","^[a-zA-Z0-9]+$"),
    EMAIL("Invalid Email","^(.+)@(.+)$"),
    NUMERIC("Numbers only","^[0-9]+$"),
    TEXT("Text",null),
    PAN("Pan Card number format","[A-Z]{3}[ABCFGHLJPTF]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}"),
    PINCODE("Expecting Pin code format","^[0-9]{6}"),
    MOBILE("10 digit mobile number allowed","^[6-9]\\d{9}$");

    private String validationText;
    private String validationRegex;
}
