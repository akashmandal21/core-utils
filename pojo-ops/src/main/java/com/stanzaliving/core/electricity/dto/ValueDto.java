package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.electricity.constants.ReadingUnitType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ValueDto {

    private Double value;

    private ReadingUnitType unit;
}
