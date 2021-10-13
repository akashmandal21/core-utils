package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.gamificationservice.enums.CorrelationCategory;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateContestTargetRequestDto extends AbstractDto {
    @NotNull(
            message = "ContestTarget Id is mandatory to update"
    )
    private String uuid;

    private String correlationUuid;

    private String correlationValue;

    private String metricUuid;

    private CorrelationCategory correlationCategory;

    private String pointsWeight;

    private String revenuePotential;

    private String conversionRate;

    private String expectedRevenue;

}

