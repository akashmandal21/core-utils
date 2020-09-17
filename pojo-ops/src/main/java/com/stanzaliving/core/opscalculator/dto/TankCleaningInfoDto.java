package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class TankCleaningInfoDto extends CategoryDto {
    List<TankCleaningSlotDto> tankCleaningSlotDtos = new ArrayList<>();
    private int totalCostForTankCleaningPerYear;
    private int costPerBedPerMonth;
}
