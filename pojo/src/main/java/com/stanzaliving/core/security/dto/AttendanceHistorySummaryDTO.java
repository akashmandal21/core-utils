package com.stanzaliving.core.security.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceHistorySummaryDTO {

    private LocalDate date;

    private Long present = 0L;

    private Long defaulters = 0L;

    private Long leaveLateEntry = 0L;
}
