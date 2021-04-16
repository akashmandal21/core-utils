package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CampaignAudienceType {
    ALL("All"),
    SPECIFIC("Specific"),
    LIST("List");

    String audienceType;


}
