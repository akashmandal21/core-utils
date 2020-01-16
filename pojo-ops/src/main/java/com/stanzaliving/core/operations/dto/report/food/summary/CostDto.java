package com.stanzaliving.core.operations.dto.report.food.summary;

import com.stanzaliving.core.operations.dto.report.PercentDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostDto {

    double budgetedCostPerStudent;

    double costPerStudent;

    PercentDto costUtilization;

    PercentDto budgetUtilization;

}
