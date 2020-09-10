package com.stanzaliving.core.utility.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricDto {
    private UnitType unit;
    private Double value;
}
