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
public class EventListAppDTO {
    private String uuid;
    private String eventName;
    private String eventType;
    private String eventTypeUuid;
    private String eventCategory;
    private String eventCategoryName;
    private Date eventStartDate;
    private Date eventEndDate;
    private Boolean pricingApplicable;
    private String imageUrl;
    private Integer price;
    private String mapLink;
    private Boolean isLiked;
    private Boolean isRegistered;
    private String eventLink;
    private Integer fomoCount;
    private Date updatedAt;
    private String description;
    private String ctaText;
    private Object stickyNotesAndTags;
    private Object isRegistrationOpen;
    private List<String> tags;
}
