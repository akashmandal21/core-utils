package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.EventDataType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CampaignEventAttributesDto{

    private String uuid;

    private String attributeName;

    private String attributeValue;

    private String operation;

    private EventDataType eventDataType;
}
