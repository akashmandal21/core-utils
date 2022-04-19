package com.stanzaliving.community.request;

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
public class EventFilterAppDTO {
    private List<String> eventCategory;
    private List<String> eventType;
    private Date startDate;
    private Date endDate;
    private Integer minPrice;
    private Integer maxPrice;
    private Boolean isFreeEvents;
    private String filterBy;
}
