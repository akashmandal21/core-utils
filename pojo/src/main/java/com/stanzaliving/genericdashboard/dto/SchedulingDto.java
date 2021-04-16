package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.Frequency;
import com.stanzaliving.genericdashboard.enums.SchedulingType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchedulingDto {
    @NotNull(message = "Scheduling type cannot be empty")
    private SchedulingType schedulingType;

    @NotNull(message = "Start Date cannot be empty")
    private Date startDate;

    @NotNull(message = "End Date cannot be empty")
    private Date endDate;

    @NotNull(message = "Frequency cannot be empty")
    private Frequency frequency;

    private List<String> dates;

    @NotNull(message = "Scheduled At cannot be empty")
    private Time scheduledAt;

    private CampaignEventsRequestDto campaignEventsRequestDto;

    private String id;
}
