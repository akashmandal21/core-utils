package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkStaffResponseDto {
    private String uuid;

    private String vendor;

    private String employeeName;

    private String emailId;

    private String mobileNo;

    private String imageUrl;

    private String hkUuid;
}
