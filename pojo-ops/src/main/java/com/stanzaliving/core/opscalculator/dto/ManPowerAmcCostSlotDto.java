package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class ManPowerAmcCostSlotDto {
    private int manpowerCount;
    @Builder.Default
    private boolean AmcCostApplicable = false;
    private int amcCostPerYear;
}
