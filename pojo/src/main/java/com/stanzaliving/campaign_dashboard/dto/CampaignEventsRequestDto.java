package com.stanzaliving.campaign_dashboard.dto;

import java.util.List;

public class CampaignEventsRequestDto {
    List<CampaignEventsDto> eventsDid;

    List<CampaignEventsDto> eventsDidNot;

    List<String> relationships;
}
