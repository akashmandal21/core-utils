package com.stanzaliving.campaign.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PulseCategory {
    private String name;
    private Double achievementPercentage;
    private List<CampaignAnswersMetaData> campaignAnswersMetaDataList;
}
