package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class FumigationPerBedBugsDto extends CategoryDto {
    private int ratePerRoomPerMonth;
    private int costPerMonthPerAvailableBed;
}
