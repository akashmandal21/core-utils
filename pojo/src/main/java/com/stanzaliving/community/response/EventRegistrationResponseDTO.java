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
    public String uuid;
    public String id;
    private String eventOrganizerUUID;
    private String ctaPrimaryText;
    private String ctaSecondaryText;
    private String ctaRedirectionLink;
    private boolean isSoldOut;
    private boolean isSeatLimited;
    private Date startDate;
    private Date endDate;
}
