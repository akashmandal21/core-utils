package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import com.stanzaliving.genericdashboard.enums.CampaignGroup;
import com.stanzaliving.genericdashboard.validation.DraftValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CampaignDetailsDto {
    @NotBlank(message = "Campaign name cannot be empty")
    @Size(
            max = 36,
            message = "Campaign Name can't be more than 36 characters",
            groups = {DraftValidation.class, Default.class})
    private String campaignName;

    @NotNull(message = "Campaign type cannot be empty")
    private CampaignDashboardType campaignType;

    @NotNull(message = "Campaign group cannot be empty")
    private CampaignGroup campaignGroup;

    private Integer priorityOrder;

    @Size(
            max = 180,
            message = "Campaign Objective can't be more than 180 characters",
            groups = {DraftValidation.class, Default.class})
    private String campaignObjective;
}
