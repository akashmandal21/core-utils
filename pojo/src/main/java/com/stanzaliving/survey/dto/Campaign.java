package com.stanzaliving.survey.dto;

import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import com.stanzaliving.genericdashboard.enums.CampaignGroup;
import com.stanzaliving.genericdashboard.enums.CampaignStatus;
import com.stanzaliving.genericdashboard.enums.SchedulingType;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
@ToString
@NoArgsConstructor
public class Campaign {
    private String campaignName;

    private String departmentName;

    private CampaignDashboardType campaignType;

    private CampaignGroup campaignGroup;

    private Integer priorityOrder;

    private String campaignObjective;

    private SchedulingType schedulingType;

    private String approvedBy;

    private Date approvedAt;

    private CampaignStatus campaignStatus;

    private String comments;

    private String templateId;

    private String schedulingId;

    private String audienceId;
}
