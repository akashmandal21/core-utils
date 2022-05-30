package com.stanzaliving.core.opscalculator.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class WaterCategoryDto extends CategoryDto{

    private int waterReqPerPersonPerDay;

    private double tankerRequirement;

    private double tankerCostPerLiter;

    private double llReceivable;

    private int waterCost;

    private int jalBoardWaterCost;

}
