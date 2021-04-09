package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.Frequency;
import com.stanzaliving.campaign_dashboard.enums.SchedulingType;

import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;
import java.util.List;

public class SchedulingDto {
    @NotNull(message = "Scheduling type cannot be empty")
    SchedulingType schedulingType;

    @NotNull(message = "Start Date cannot be empty")
    Date startDate;

    @NotNull(message = "End Date cannot be empty")
    Date endDate;

    @NotNull(message = "Frequency cannot be empty")
    Frequency frequency;

    List<String> dates;

    @NotNull(message = "Scheduled At cannot be empty")
    Time scheduledAt;

    CampaignEventsRequestDto campaignEventsRequestDto;

    Long id;
}
