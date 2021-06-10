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

    @Builder.Default
    private Long present = 0L;

    @Builder.Default
    private Long leaveLateEntry = 0L;

    @Builder.Default
    private Long optedOut = 0L;

    @Builder.Default
    private Long pending = 0L;
}
