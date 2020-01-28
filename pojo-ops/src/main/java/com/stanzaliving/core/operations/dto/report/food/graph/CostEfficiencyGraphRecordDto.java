package com.stanzaliving.core.operations.dto.report.food.graph;

import com.stanzaliving.core.operations.dto.report.GraphRecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostEfficiencyGraphRecordDto {

    Double overallTotalCost;
    Double breakfastTotalCost;
    Double lunchTotalCost;
    Double snacksTotalCost;
    Double dinnerTotalCost;
    Double brunchTotalCost;
    Double lunchTiffinTotalCost;
    Double overallBudgetCost;
    Double breakfastBudgetCost;
    Double lunchBudgetCost;
    Double snacksBudgetCost;
    Double dinnerBudgetCost;
    Double brunchBudgetCost;
    Double lunchTiffinBudgetCost;
    String frequencyValue;
    Integer totalCount;
    Integer menuAdherenceCount;
    Integer quantityAdherenceCount;

}
