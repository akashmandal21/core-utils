package com.stanzaliving.core.operations.dto.report.food.summary;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostDto {

    double excpectedMealCost;

    int movedInResidents;

    double totalMealCost;

    double budgetedMealCost;
    
    int occupiedBeds;
    
    int totalMealsOrdered;

}
