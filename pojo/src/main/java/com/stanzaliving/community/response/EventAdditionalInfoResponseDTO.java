package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventAdditionalInfoResponseDTO {
    private Long id;

    private String uuid;

    private String onlineStreamingLink;

    private String onlineStreamID;

    private String passcode;

    private String outDoorEventLocation;

    private String residenceUUID;

    private String venueName;

    private String addressLine1;

    private String addressLine2;

    private Long fomoCount;

    private String city;

    private String state;

    private String cityName;

    private String stateName;

    private String pincode;

    private String eventDescription;

    private String mapLink;

    private String venueType;
}
