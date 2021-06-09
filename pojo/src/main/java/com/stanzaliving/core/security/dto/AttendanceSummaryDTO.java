package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceSummaryDTO {

    private Long present = 0L;

    private Long leaveLateEntry = 0L;

    private Long optedOut = 0L;

    private Long pending = 0L;
}
