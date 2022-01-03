package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

import java.util.List;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class CoverageMetricsDetailedResponseDto {

    String residenceUuid;
    String residenceName;
    List<CoverageMetricsResponseDto> coverageMetricsResponseDto;
}
