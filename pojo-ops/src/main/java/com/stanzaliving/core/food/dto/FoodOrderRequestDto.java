package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	private String residenceName;

	@NotNull(message = "Food Order Date is mandatory")
	private LocalDate menuDate;

	@Builder.Default
	private Boolean ordered = false;

	@Builder.Default
	private Boolean withinBudget = false;

	private Integer mir;

	private Integer veg;

	private Integer nonVeg;

	@Builder.Default
	private Integer totalOrder = 0;

	@Builder.Default
	private Integer orderedCount = 0;

	private List<FoodOrderMenuCategoryDto> foodOrderMenuCategoryDtoList;

	@NotEmpty(message = "Meal Orders are mandatory")
	private List<FoodOrderDetailDto> foodOrderDetailDtos;

	@Builder.Default
	private Double plannedUtilization = 0d;

	@Builder.Default
	private Double actualUtilization = 0d;

	@Builder.Default
	private Boolean residenceFoodOrderTimeOut = true;

	@Builder.Default
	private Set<String> slExtraOrderEmails = new HashSet<>();

}