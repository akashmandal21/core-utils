package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

import java.time.LocalTime;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class CoverageMetricsRequestDto {

    private String planningTemplateUuid;
    private String microClusterUuid;
    private LocalTime startDate;
}
