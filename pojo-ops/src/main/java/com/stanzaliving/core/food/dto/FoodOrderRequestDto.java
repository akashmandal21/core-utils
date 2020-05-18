package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
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
public class FoodOrderRequestDto {

	private String groupOrderId;

	private String residenceId;

	private String residenceName;

	private LocalDate menuDate;

	private Boolean ordered;

	private Boolean withinBudget;

	private Integer mir;

	private Integer veg;

	private Integer nonVeg;

	private List<FoodOrderDetailDto> foodOrderDetailDtos;

	@Builder.Default
	private Double plannedUtilization = 0d;

	@Builder.Default
	private Double actualUtilization = 0d;

}
