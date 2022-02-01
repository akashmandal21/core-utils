package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class CoverageMetricsDetailsRequestDto {

    private String microClusterUuid;
    private String beatPlanUUid;
    private String taskSubCategoryUuid;
}
