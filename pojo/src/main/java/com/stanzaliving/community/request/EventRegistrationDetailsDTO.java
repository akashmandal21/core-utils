package com.stanzaliving.community.request;

import com.stanzaliving.community.validations.ApprovalValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRegistrationDetailsDTO {
    @NotEmpty(groups = ApprovalValidation.class,message = "Event Organization UUID should not be empty")
    private String eventOrganizerUUID;

    @NotNull(groups = ApprovalValidation.class,message = "Event Registration Start Date should not be empty")
    private Date registrationStartDate;

    @NotNull(groups = ApprovalValidation.class,message = "Event Registration End Date should not be empty")
    private Date registrationEndDate;

    @Max(message = "String size should not Exceed 16 characters", value = 16L)
    @NotEmpty(groups = ApprovalValidation.class,message = "Event CTA should not be empty")
    private String ctaText;

    private String ctaSecondaryText;

    private String ctaRedirectionLink;

    @NotNull(groups = ApprovalValidation.class,message = "Event sold out should not be empty")
    private Boolean isSoldOut;

    private Boolean isSeatsAvailable;
}
