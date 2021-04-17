package com.stanzaliving.notification.dto;

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
   private Long uuid;

    @NotBlank(message = "App Id cannot be empty or null")
     private String appName;

    @NotBlank(message = "Campaign Id cannot be empty or null")
    private String campaignId;

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