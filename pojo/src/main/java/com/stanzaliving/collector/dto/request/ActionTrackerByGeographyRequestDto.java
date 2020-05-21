package com.stanzaliving.collector.dto.request;

import com.stanzaliving.collector.enums.DataValueType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionTrackerByGeographyRequestDto extends RentDashboardRequestDto {
    @NotNull
    DataValueType dataValueType;
}
