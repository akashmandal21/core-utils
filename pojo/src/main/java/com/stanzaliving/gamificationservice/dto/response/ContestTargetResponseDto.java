package com.stanzaliving.gamificationservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContestTargetResponseDto extends AbstractDto {
    private String correlationUuid;

    private String correlationValue;

    private String metricUuid;

    private String correlationCategory;

    private String pointsWeight;

    private String revenuePotential;

    private String conversionRate;

    private String expectedRevenue;

}

