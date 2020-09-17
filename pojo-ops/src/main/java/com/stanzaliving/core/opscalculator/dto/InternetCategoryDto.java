package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class InternetCategoryDto extends CategoryDto {
    private int internetPlanRate;
    private double MGOccupancyPercent;

    private int internetCharges;

    @Builder.Default
    private String infoMessage = "Details have been automatically picked from the service mix version.";
}
