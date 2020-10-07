package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class AmcCostSlotDto {
    private int count;
    private String capacity;
    @Builder.Default
    private boolean AmcCostApplicable = false;
    private int amcCostPerYear;
}
