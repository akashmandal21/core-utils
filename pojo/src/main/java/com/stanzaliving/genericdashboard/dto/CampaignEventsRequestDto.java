package com.stanzaliving.genericdashboard.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignEventsRequestDto {

    private  List<CampaignEventsDto> eventsDid;

    private List<CampaignEventsDto> eventsDidNot;

    private List<String> relationships;

    private String interRelationOperator;
}