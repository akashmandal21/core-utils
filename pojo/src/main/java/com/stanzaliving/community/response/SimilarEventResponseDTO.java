package com.stanzaliving.community.response;

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
public class SimilarEventResponseDTO {
    private String eventId;
    private String eventName;
    private String eventType;
    private String eventCategory;
    private String eventCategoryName;
    private Date eventStartDate;
    private Date eventEndDate;
    private Long priorityOrder;
    private String eventStatus;
    private String uuid;
    private String imageUrl;
    private Long fomoCount;
    private String mapLink;
    private String eventLink;
    private Boolean isLiked;
    private Boolean isRegistered;
    private List<String> tags;
    private String ctaText;
    private Object stickyNotesAndTags;
    private Object isRegistrationOpen;
    private Long price;
    private Boolean pricingApplicable;
}
