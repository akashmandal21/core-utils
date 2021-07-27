package com.stanzaliving.core.bookingservice.dto.request;

import com.stanzaliving.core.bookingservice.dto.PhoneNumberDto;
import com.stanzaliving.core.utilservice.annotations.Email;
import com.stanzaliving.core.utilservice.annotations.IsStringOnlyAlphabet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDetailRequestDto {

    @IsStringOnlyAlphabet (message = "Invalid First Name")
    private String firstName;

    @IsStringOnlyAlphabet (message = "Invalid Last Name")
    private String lastName;

    @Valid
    private PhoneNumberDto mobile;

    @NotBlank(message = "Email is mandatory to add new user")
    @Email
    private String email;

}
