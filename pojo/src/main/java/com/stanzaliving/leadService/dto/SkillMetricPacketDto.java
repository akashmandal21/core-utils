package com.stanzaliving.leadService.dto;

import com.stanzaliving.core.leaddashboard.enums.MetricEnum;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SkillMetricPacketDto {
    private MetricEnum metricEnum;
    private String metricUuid;
}
