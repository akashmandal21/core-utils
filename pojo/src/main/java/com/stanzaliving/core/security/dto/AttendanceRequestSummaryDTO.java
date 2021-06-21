package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestSummaryDTO {

    @Builder.Default
    private Long approved = 0L;

    @Builder.Default
    private Long rejected = 0L;

    @Builder.Default
    private Long pending = 0L;

    @Builder.Default
    private Long autoApproved = 0L;

    @Builder.Default
    private Long cancelled = 0L;
}