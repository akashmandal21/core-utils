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
public class UpdateHkStaffRequestDto {
    @NotNull(
            message = "HkStaff Id is mandatory to update HkStaff"
    )
    private String uuid;

    private String vendor;

    private String employeeName;

    @Email
    private String emailId;

    @Size(min = 10, max = 10, message = "Mobile must be of 10 digits")
    private String mobileNo;

    private String imageUrl;

    private String hkUuid;
}
