package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class GarbageCostDto extends CategoryDto {
    private int costPerMonth;
    private int costPerBedPerMonth;
}
