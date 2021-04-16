package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import com.stanzaliving.genericdashboard.enums.CampaignStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CampaignFilterDto {

    private List<CampaignDashboardType> campaignType;

    private List<CampaignStatus> campaignStatus;

    private AudienceLocationDto audienceLocation;

    private DateRangeDto startDateRange;

    private DateRangeDto endDateRange;
}
