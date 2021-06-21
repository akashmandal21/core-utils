package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRegistrationResponseDTO {
    private String uuid;
    private Long id;
    private String eventOrganizerUUID;
    private String eventOrganizer;
    private Date registrationStartDate;
    private Date registrationEndDate;
    private String ctaText;
    private String ctaSecondaryText;
    private String ctaRedirectionLink;
    private Boolean isSoldOut;
    private Boolean isSeatsAvailable;
}
