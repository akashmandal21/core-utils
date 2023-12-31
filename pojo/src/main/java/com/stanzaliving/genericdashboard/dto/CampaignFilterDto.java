package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import com.stanzaliving.genericdashboard.enums.CampaignStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignFilterDto {

    private List<CampaignDashboardType> campaignType;

    private List<CampaignStatus> campaignStatus;

    private AudienceLocationDto audienceLocation;

    private DateRangeDto startDateRange;

    private DateRangeDto endDateRange;
}
