package com.stanzaliving.core.opscalculatorv2.dto;

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
    private boolean amcCostApplicable = true;
    private int amcCostPerYear;
}
