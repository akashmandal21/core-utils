package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.EventType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class CampaignEventsDto {

    private String uuid;

    private String eventName;
    
    private String campaignId;

    private String eventCategoryName;

    private EventType eventType;

    private List<CampaignEventAttributesDto> eventAttributesDtos;

    private String relationshipOperator;
  
}
