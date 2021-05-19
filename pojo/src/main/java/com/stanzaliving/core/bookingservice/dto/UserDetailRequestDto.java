package com.stanzaliving.core.bookingservice.dto;

import com.stanzaliving.core.utilservice.annotations.Email;
import com.stanzaliving.core.utilservice.annotations.IsStringOnlyAlphabet;
import com.stanzaliving.core.utilservice.annotations.validator.PhoneNumberValidator;
import lombok.Data;


@Data
public class UserDetailRequestDto {

    @IsStringOnlyAlphabet (message = "Invalid First Name")
    private String firstName;

    @IsStringOnlyAlphabet (message = "Invalid Last Name")
    private String lastName;

    private PhoneNumberValidator.PhoneNumber mobile;

    @Email
    private String email;

}
