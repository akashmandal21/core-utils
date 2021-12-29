package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HkStaffRequestDto {

    @NotNull(message = "Vendor is mandatory")
    private String vendor;

    @NotNull(message = "Employee Name is mandatory")
    private String employeeName;

    @NotNull(message = "Email is mandatoryr")
    @Email
    private String emailId;

    @Size(min = 10, max = 10, message = "Mobile must be of 10 digits")
    @NotNull(message = "Mobile Number is mandatory")
    private String mobileNo;

    private String imageUrl;

    private String hkUuid;
}
