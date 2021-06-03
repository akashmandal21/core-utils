package com.stanzaliving.community.request;

import com.stanzaliving.community.validations.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEventDTO {
    @NotEmpty(groups = {DraftValidations.class, ApprovalValidation.class})
    private String eventStatus;

    @NotEmpty(groups = ApprovalValidation.class)
    private String eventTypeUUID;

    @Valid
    @NotNull(groups = ApprovalValidation.class)
    private EventAdditionalInfoRequestDTO moreInformation;

    @NotEmpty(groups = ApprovalValidation.class)
    private String eventCategoryUUID;

    @NotEmpty(groups = ApprovalValidation.class)
    private String eventName;

    @NotNull(groups = ApprovalValidation.class)
    private Date eventStartDate;

    @NotNull(groups = ApprovalValidation.class)
    private Date eventEndDate;

    @NotNull(groups = ApprovalValidation.class)
    private Long priorityOrder;

    private List<String> eventTag;

    @NotNull(groups = ApprovalValidation.class)
    private Boolean pricingApplicable;

    @Valid
    private EventPriceDTO eventPrice;

    @Valid
    private EventRegistrationDetailsDTO registrationDetails;

    @NotEmpty(groups = ApprovalValidation.class)
    private List<EventImagesDTO> images;

    @Valid
    private UserListDTO userList;

    private EventFaqDTO faq;
}
