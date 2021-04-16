package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CampaignEventsDto {
    private String id;

    private String eventName;

    private String eventCategoryName;

    private EventType eventType;

    private List<CampaignEventAttributesDto> eventAttributesDtos;
}
