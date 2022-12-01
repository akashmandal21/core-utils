package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceResponseDto {
    private String metric;
    private String currentPercentage;
    private String changePercentage;
    private String metadata;
}
