package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.gamificationservice.enums.CorrelationCategory;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContestTargetRequestDto extends AbstractDto {
    @NotBlank(message = "correlation Id cannot be empty")
    private String correlationUuid;

    private String correlationValue;

    @NotBlank(message = "metric Id cannot be empty")
    private String metricUuid;

    private CorrelationCategory correlationCategory;

    private String pointsWeight;

    private String revenuePotential;

    private String conversionRate;

    private String expectedRevenue;

}

