package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.campaign.dto.response.FileStatusResponseDto;
import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import com.stanzaliving.genericdashboard.enums.CampaignGroup;
import com.stanzaliving.genericdashboard.enums.CampaignStatus;
import com.stanzaliving.genericdashboard.enums.SchedulingType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignListDto {

    public CampaignListDto(String uuid, String campaignName, CampaignDashboardType campaignType, CampaignGroup campaignGroup, Integer priorityOrder, SchedulingType schedulingType, CampaignStatus campaignStatus, String createdBy, Date createdAt, Date startDate, Date endDate) {
        this.uuid = uuid;
        this.campaignName = campaignName;
        this.campaignType = campaignType;
        this.campaignGroup = campaignGroup;
        this.priorityOrder = priorityOrder;
        this.schedulingType = schedulingType;
        this.campaignStatus = campaignStatus;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private String uuid;

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

    private FileStatusResponseDto fileStatusResponse;
}
