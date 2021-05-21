package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.EventDataType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignEventAttributesDto{

    private String uuid;

    private String attributeName;

    private String attributeValue;

    private String operation;

    private EventDataType eventDataType;
}
