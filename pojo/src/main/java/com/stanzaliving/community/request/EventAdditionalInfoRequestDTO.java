package com.stanzaliving.community.request;

import com.stanzaliving.community.validations.ApprovalValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventAdditionalInfoRequestDTO {

    private String uuid;

    private String venueType;

    private String onlineStreamingLink;

    private String onlineStreamID;

    private String passcode;

    private String outdoorEventLocation;

    private String residenceUUID;

    private String venueName;

    private String addressLine1;

    private String addressLine2;

    private Long fomoCount;

    private String city;

    private String state;

    private String pincode;

    @NotEmpty(groups = ApprovalValidation.class,message = "Event Description should not be Empty")
    private String eventDescription;

    private String mapLink;
}
