package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CampaignEventsRequestDto {
    private List<CampaignEventsDto> eventsDid;

    private List<CampaignEventsDto> eventsDidNot;

    private List<String> relationships;
}
