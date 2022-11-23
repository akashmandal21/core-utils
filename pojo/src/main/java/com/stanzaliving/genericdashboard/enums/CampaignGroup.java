package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CampaignGroup {
    MANDATORY("Mandatory"),
    SKIPPABLE("Skippable");

    String group;

}
