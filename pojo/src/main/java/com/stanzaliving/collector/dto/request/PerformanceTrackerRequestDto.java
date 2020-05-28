package com.stanzaliving.collector.dto.request;

import com.stanzaliving.collector.enums.DataValueType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class PerformanceTrackerRequestDto extends RentDashboardRequestDto {
    @NotNull
    DataValueType dataValueType;
    @NotNull
    LocalDate fromDate;
}
