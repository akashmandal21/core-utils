package com.stanzaliving.community.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEventDTO {
    private String eventStatus;
    private String eventTypeUUID;
    private AddEventAdditionalInfoDTO moreInformation;
    private String categoryUUID;
    private String name;
    private Date startDate;
    private Date endDate;
    private Long priority;
    private List<String> eventTag;
    private AddEventPriceForAddEventDTO eventPrice;
    private String eventOrganizerUUID;
    private AddEventRegistrationDetailsDTO registrationDetails;
    private List<AddEventImagesForAddEventDTO> images;
    @Valid private UserListDTO userList;
    private AddEventFaqForAddEventDTO faq;
}
