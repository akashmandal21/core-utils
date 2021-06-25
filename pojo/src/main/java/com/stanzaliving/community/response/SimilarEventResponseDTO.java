package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimilarEventResponseDTO {
    private String eventId;
    private String eventName;
    private String eventType;
    private String eventCategory;
    private Date eventStartDate;
    private Date eventEndDate;
    private Long priorityOrder;
    private String eventStatus;
    private String uuid;
    private String imageUrl;
    private Long fomoCount;
    private Boolean isLiked;
    private Boolean isRegistered;
    private Long price;
    private Boolean pricingApplicable;
}
