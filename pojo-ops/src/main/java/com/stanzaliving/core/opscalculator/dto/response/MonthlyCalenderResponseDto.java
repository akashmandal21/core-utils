package com.stanzaliving.core.opscalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MonthlyCalenderResponseDto {
    List<LocalDate> holidays;
    List<LocalDate> specialDays;
    Integer annualHolidayCount;
}
