package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventAdditionalInfoDTO {
    private Long fomoCount;
    private String description;
    private String onlineStreamingLink;
    private String onlineStreamID;
    private String passcode;
    private String residenceUUID;
    private String venueName;
    private String addressLine1;
    private String addressLine2;
    private String cityUUID;
    private String stateUUID;
    private String pincode;
    private String mapLink;
}
