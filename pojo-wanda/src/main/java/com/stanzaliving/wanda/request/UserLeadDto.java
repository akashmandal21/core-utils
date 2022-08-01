package com.stanzaliving.wanda.request;

import com.stanzaliving.core.utilservice.annotations.EnsureNumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLeadDto {
    private String firstName;
    private String lastName;

    @NotBlank(message = "Mobile Number is Mandatory")
    @EnsureNumber(message = "Mobile must contain only numbers", fieldName = "phone")
    private String phone;
    private String leadSourceDesc;
    private String leadEmail;
}
