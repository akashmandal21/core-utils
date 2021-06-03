package com.stanzaliving.community.response;

import com.stanzaliving.community.request.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventResponseDTO {
    private Long id;
    private String uuid;
    private String eventID;
    private String eventName;
    private String eventStatus;
    private String eventTypeUUID;
    private String eventCategoryUUID;
    private Date eventStartDate;
    private Date eventEndDate;
    private Date createdAt;
    private String createdBy;
    private Long priorityOrder;
    private List<String> eventTag;
    private Boolean pricingApplicable;
    private EventAdditionalInfoResponseDTO moreInformation;
    private EventPriceResponseDTO eventPrice;
    private EventRegistrationResponseDTO registrationDetails;
    private List<EventImagesResponseDTO> images;
    private UserListResponseDTO userList;
    private EventFaqResponseDTO faq;
}
