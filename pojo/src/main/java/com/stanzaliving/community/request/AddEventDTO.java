package com.stanzaliving.community.request;

import com.stanzaliving.community.validations.*;
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

    @NotEmpty(message = "Event Status Should not be empty",
            groups = {DraftValidations.class, ApprovalValidation.class})
    private String eventStatus;

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

    @Pattern(groups = ApprovalValidation.class,message = "Priority Cant be 0 or negative",regexp = "^[1-9]\\d*$")
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
