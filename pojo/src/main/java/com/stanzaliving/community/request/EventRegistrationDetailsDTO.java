package com.stanzaliving.community.request;

import com.stanzaliving.community.validations.ApprovalValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRegistrationDetailsDTO {
    @NotEmpty(groups = ApprovalValidation.class)
    private String eventOrganizerUUID;

    @NotNull(groups = ApprovalValidation.class)
    private Date registrationStartDate;

    @NotNull(groups = ApprovalValidation.class)
    private Date registrationEndDate;

    @NotEmpty(groups = ApprovalValidation.class)
    private String ctaText;

    private String ctaSecondaryText;

    private String ctaRedirectionLink;

    @NotNull(groups = ApprovalValidation.class)
    private Boolean isSoldOut;

    private Boolean isSeatsAvailable;
}
