package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonInclude;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HkStaffResponseDto {
    protected String createdBy;
    protected String updatedBy;
    private String uuid;
    private String vendor;
    private String employeeName;
    private String emailId;
    private String mobileNo;
    private String imageUrl;
    private String hkUuid;
}
