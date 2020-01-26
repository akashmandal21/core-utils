package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostUtilizationRecordDto extends RecordDto {

	private MealDto totalCost;

	private MealDto expectedCost;
	
	private MealDto budgetedCost;

	private MealDto orderCount;

	private Integer occupiedBeds;

}