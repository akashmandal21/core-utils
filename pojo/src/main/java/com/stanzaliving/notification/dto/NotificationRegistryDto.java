package com.stanzaliving.notification.dto;

import com.stanzaliving.genericdashboard.dto.CampaignAudienceDto;
import com.stanzaliving.genericdashboard.dto.SchedulingDto;
import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import com.stanzaliving.genericdashboard.enums.TemplateLayout;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRegistryDto {
    Long id;

    @NotBlank(message = "App Id cannot be empty or null")
    String appName;

    String campaignId;

    CampaignDashboardType campaignDashboardType;

    TemplateLayout templateLayout;

    String title;

    String message;

    String callToActionUrl;

    String imageUrl;

    SchedulingDto scheduledAt;

    CampaignAudienceDto campaignAudience;

    Long timeToLive;

    List<UserParams> userParamsList;

    Map<String, String> data;

    Map<String, String> eventsData;
}