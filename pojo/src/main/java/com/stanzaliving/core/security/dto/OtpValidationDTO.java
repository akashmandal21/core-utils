package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.utilservice.annotations.EnsureNumber;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OtpValidationDTO {

    @NotBlank(message = "Mobile Number is required.")
    @EnsureNumber(message = "Mobile must contain only numbers", fieldName = "mobile")
    private String mobile;

    @NotBlank(message = "OTP cannot be blank")
    @Size(min = 4, max = 6, message = "OTP must be of 4-6 characters")
    @EnsureNumber(message = "OTP must contain only numbers", fieldName = "OTP")
    private String otp;

    @NotBlank(message = "ISO Code is required.")
    private String isoCode;
}
