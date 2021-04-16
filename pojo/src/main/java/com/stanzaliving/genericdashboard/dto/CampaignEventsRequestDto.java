package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignEventsRequestDto {

    private List<CampaignEventsDto> eventsDid;

    private List<CampaignEventsDto> eventsDidNot;

    private List<String> relationships;

    private String interRelationOperator;
}