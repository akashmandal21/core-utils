package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEventRegistrationDetailsDTO {
    private String eventOrganizerUUID;
    private Date startDate;
    private Date endDate;
    private String ctaPrimaryText;
    private String ctaSecondaryText;
    private String ctaRedirectionLink;
    private boolean isSoldOut;
    private boolean isSeatLimited;
}
