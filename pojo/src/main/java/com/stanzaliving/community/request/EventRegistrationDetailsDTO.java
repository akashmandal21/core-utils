package com.stanzaliving.community.request;

import com.stanzaliving.community.validations.ApprovalValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRegistrationDetailsDTO {
    private String uuid;

    @NotEmpty(groups = ApprovalValidation.class,message = "Event Organizer should not be empty")
    private String eventOrganizerUUID;

    @NotNull(groups = ApprovalValidation.class,message = "Event Registration Start Date should not be empty")
    private Date registrationStartDate;

    @NotNull(groups = ApprovalValidation.class,message = "Event Registration End Date should not be empty")
    private Date registrationEndDate;

    @Size(message = "String size should not Exceed 16 characters", max = 16)
    @Pattern(groups = {ApprovalValidation.class},regexp = "^[^0-9]+$",message = "CTA text cannot be numbers")
    @NotEmpty(groups = ApprovalValidation.class,message = "Event CTA should not be empty")
    private String ctaText;

    private String ctaSecondaryText;

    private String ctaRedirectionLink;

    @NotNull(groups = ApprovalValidation.class,message = "Event sold out should not be empty")
    private Boolean isSoldOut;

    private Boolean isSeatsAvailable;
}
