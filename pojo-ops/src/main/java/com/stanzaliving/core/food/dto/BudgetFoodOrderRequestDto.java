package com.stanzaliving.core.food.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class BudgetFoodOrderRequestDto {

	private List<FoodOrderRequestDto> foodOrderRequestDtos;

	private Integer hostels;

	private Integer ordered;

	private Integer pending;

	@Builder.Default
	private Double plannedUtilization = 0d;

	@Builder.Default
	private Double actualUtilization = 0d;
	
	@Builder.Default
	private Boolean editingAllowed=true;
	
	private String orderEditingMessage;

}
