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
public class EventFilterCountDTO {
    private String filterBy;
    private List<String> eventTypeUuid;
    private List<String> categoryUuid;
    private Date startDate;
    private Date endDate;
    private Long minPrice;
    private Long maxPrice;
    private Boolean isFreeEvents;
}
