package com.stanzaliving.notification.dto;

import com.stanzaliving.genericdashboard.dto.CampaignAudienceDto;
import com.stanzaliving.genericdashboard.dto.SchedulingDto;
import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import com.stanzaliving.genericdashboard.enums.Frequency;
import com.stanzaliving.genericdashboard.enums.TemplateLayout;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRegistryDto {
    private String uuid;

    @NotBlank(message = "App Id cannot be empty or null")
     private String appName;

    @NotBlank(message = "Campaign Id cannot be empty or null")
    private String campaignUuid;

    @NotNull(message = "Campaign Type cannot be empty or null")
    private CampaignDashboardType campaignDashboardType;

    private TemplateLayout templateLayout;

    private Frequency frequency;

    private String title;

    private String message;

    private String callToActionUrl;

    private String imageUrl;

    private SchedulingDto scheduledAt;

    private CampaignAudienceDto campaignAudience;

    private Long timeToLive;

    private List<UserParams> userParamsList;

    private Map<String, String> data;
}