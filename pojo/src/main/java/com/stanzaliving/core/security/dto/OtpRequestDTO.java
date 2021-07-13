package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.utilservice.annotations.EnsureNumber;
import javax.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OtpRequestDTO {

    @NotBlank(message = "Mobile Number is required.")
    @EnsureNumber(message = "Mobile must contain only numbers", fieldName = "mobile")
    private String mobile;

    @NotBlank(message = "ISO Code is required.")
    private String isoCode;
}
