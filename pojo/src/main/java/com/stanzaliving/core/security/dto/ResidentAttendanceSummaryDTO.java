package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentAttendanceSummaryDTO {

    private Integer presentCount;

    private Integer absentCount;

    private Integer exemptedCount;
}
