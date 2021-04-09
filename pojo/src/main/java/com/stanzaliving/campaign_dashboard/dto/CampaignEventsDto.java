package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.EventType;

import java.util.List;

public class CampaignEventsDto {
    Long id;

    String eventName;

    String eventCategoryName;

    EventType eventType;

    List<CampaignEventAttributesDto> eventAttributesDtos;
}
