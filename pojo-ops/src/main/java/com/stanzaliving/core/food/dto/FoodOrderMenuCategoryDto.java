package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderMenuCategoryDto {

	private String dealUuid;

	private String menuCategoryId;

	private String menuCategoryName;

	private String groupId;

	private String shortCode;

	private Integer mirCount;

	@Builder.Default
	private Boolean ordered = false;

	private Double budgetPerMir;

	private Double estimatedCostPerBed;

	private Double mtdCostPerBed;

	private Double mtdCostDiff;

	private Double mtdCostUtil;

	@NotEmpty(message = "Meal Orders are mandatory")
	private List<FoodOrderDetailDto> foodOrderDetailDtoList;

}
