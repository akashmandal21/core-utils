package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignEventsDto {

    private String uuid;

    private String eventName;

    private String eventCategoryName;

    private EventType eventType;

    private List<CampaignEventAttributesDto> eventAttributesDtos;

    private String relationshipOperator;
}
