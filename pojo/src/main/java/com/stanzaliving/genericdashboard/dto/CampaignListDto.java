package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import com.stanzaliving.genericdashboard.enums.CampaignGroup;
import com.stanzaliving.genericdashboard.enums.CampaignStatus;
import com.stanzaliving.genericdashboard.enums.SchedulingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CampaignListDto {
    private String id;

    private String campaignName;

    private CampaignDashboardType campaignType;

    private CampaignGroup campaignGroup;

    private Integer priorityOrder;

    private SchedulingType schedulingType;

    private CampaignStatus campaignStatus;

    private String createdBy;

    private Date createdAt;

    private Date startDate;

    private Date endDate;
}
