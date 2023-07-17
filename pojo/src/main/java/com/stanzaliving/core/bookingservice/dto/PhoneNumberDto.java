package com.stanzaliving.core.bookingservice.dto;

//import com.stanzaliving.core.utilservice.annotations.ValidPhoneNumber;
//import com.stanzaliving.core.utilservice.annotations.validator.PhoneNumberValidator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ValidPhoneNumber //todo: check this || implements PhoneNumberValidator.PhoneNumber
public class PhoneNumberDto implements Serializable {
    private String mobile;
    private String countryCode;

//    @Override
    public String getMobile() {
        return mobile;
    }

//    @Override
    public String getCountryCode() {
        return countryCode;
    }
}
