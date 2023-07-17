package com.stanzaliving.community.request;

import com.stanzaliving.community.enums.EventStatus;
import com.stanzaliving.community.validations.ApprovalValidation;
import com.stanzaliving.community.validations.DraftValidations;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEventDTO {

    private String eventID;

    @NotNull(message = "Event Status Should not be empty",
            groups = {DraftValidations.class, ApprovalValidation.class})
    private EventStatus eventStatus;

    @NotEmpty(groups = ApprovalValidation.class,message = "Event Type UUID should not be empty")
    private String eventTypeUUID;

    @Valid
    @NotNull(groups = ApprovalValidation.class,message = "Event Additional Info should not be empty")
    private EventAdditionalInfoRequestDTO moreInformation;

    @NotEmpty(groups = ApprovalValidation.class,message = "Event Category UUID should not be empty")
    private String eventCategoryUUID;

    @Size(max = 48,message = "Size of Event Name Should not Exceed 48  characters",groups = {ApprovalValidation.class})
    @NotEmpty(groups = ApprovalValidation.class,message = "Event Name should not be empty")
    private String eventName;

    @NotNull(groups = ApprovalValidation.class,message = "Event start Date should not be empty")
    private Date eventStartDate;

    @NotNull(groups = ApprovalValidation.class,message = "Event End Date should not be empty")
    private Date eventEndDate;

    @Min(value = 0,groups = ApprovalValidation.class,message = "Event Priority should not be less than 0")
    @NotNull(groups = ApprovalValidation.class,message = "Event Priority should not be empty")
    private Long priorityOrder;

    private List<String> eventTag;

    @NotNull(groups = ApprovalValidation.class,message = "Event Pricing toggle should not be empty")
    private Boolean pricingApplicable;

    @Valid
    private EventPriceDTO eventPrice;

    @Valid
    private EventRegistrationDetailsDTO registrationDetails;

    @NotEmpty(groups = ApprovalValidation.class,message = "Event Images should not be empty")
    private List<EventImagesDTO> images;

    @Valid
    private UserListDTO userList;

    private EventFaqDTO faq;
}
