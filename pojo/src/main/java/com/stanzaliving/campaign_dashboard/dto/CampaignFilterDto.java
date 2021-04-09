package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.CampaignDashboardType;
import com.stanzaliving.campaign_dashboard.enums.CampaignStatus;

import java.util.List;

public class CampaignFilterDto {

    List<CampaignDashboardType> campaignType;

    List<CampaignStatus> campaignStatus;

    AudienceLocationDto audienceLocation;

    DateRangeDto startDateRange;

    DateRangeDto endDateRange;
}
