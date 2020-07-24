package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.food.dto.request.AdditionalItemsRequestDto;
import com.stanzaliving.core.operations.enums.MealType;

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
public class FoodOrderDetailDto {

	private String residenceFoodMenuId;

	private MealType mealType;

	private String mealName;

	private String vendorId;

	private String vendorName;

	@Builder.Default
	private Integer vegPax = 0;

	@Builder.Default
	private Integer nonVegPax = 0;

	@Builder.Default
	private Double vegCost = 0d;

	@Builder.Default
	private Double nonVegCost = 0d;

	@Builder.Default
	private Integer stanzaStaffVegPax = 0;

	@Builder.Default
	private Integer stanzaStaffNonVegPax = 0;

	@Builder.Default
	private Double stanzaStaffVegCost = 0d;

	@Builder.Default
	private Double stanzaStaffNonVegCost = 0d;

	private Integer nonStanzaStaffVegPax;

	private Integer nonStanzaStaffNonVegPax;

	@Builder.Default
	private Double nonStanzaStaffVegCost = 0d;

	@Builder.Default
	private Double nonStanzaStaffNonVegCost = 0d;

	@Builder.Default
	private Double additionalItemsCost = 0d;

	@Builder.Default
	private Double totalCost = 0d;

	private Integer sequence;

	private List<AdditionalItemsRequestDto> additionalItemsDtos;

	private List<FoodOrderBasePreferenceDto> foodOrderBasePreferenceDto;

	@Builder.Default
	private Double plannesUtilization = 0d;

	@Builder.Default
	private Double actualUtilization = 0d;

	private boolean packaged;

}