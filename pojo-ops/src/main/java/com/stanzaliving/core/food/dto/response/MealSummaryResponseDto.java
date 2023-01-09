package com.stanzaliving.core.food.dto.response;

import java.io.Serializable;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealSummaryResponseDto implements Serializable {
	private static final long serialVersionUID = -1489352139506367799L;
	private MealType mealType;
	private boolean isApplicable;
}
