package com.stanzaliving.core.opscalculator.V2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class AmcCostSlotV2Dto {
    private int count;
    private int countSuggestedValue;
    private int countSuggestedValueReason;
    private String capacity;
    private String name;
    private String placeHolder;
    @Builder.Default
    private boolean amcCostApplicable = false;
    private int amcCostPerYear;
}
