package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.CampaignDashboardType;
import com.stanzaliving.campaign_dashboard.enums.CampaignGroup;
import com.stanzaliving.campaign_dashboard.enums.CampaignStatus;
import com.stanzaliving.campaign_dashboard.enums.SchedulingType;

import java.util.Date;

public class CampaignListDto {
    Long id;

    String campaignName;

    CampaignDashboardType campaignType;

    CampaignGroup campaignGroup;

    Integer priorityOrder;

    SchedulingType schedulingType;

    CampaignStatus campaignStatus;

    String createdBy;

    Date createdAt;

    Date startDate;

    Date endDate;
}
