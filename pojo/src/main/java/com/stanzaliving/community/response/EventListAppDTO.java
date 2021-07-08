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
public class EventListAppDTO {
    private String uuid;
    private String eventName;
    private String eventType;
    private String eventCategory;
    private Date eventStartDate;
    private Date eventEndDate;
    private Boolean pricingApplicable;
    private String imageUrl;
    private Integer price;
    private Boolean isLiked;
    private Boolean isRegistered;
    private String eventLink;
    private Integer fomoCount;
    private Date updatedAt;
    private  String description;
}
