package com.stanzaliving.core.food.dto;

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

	private Long id;

	private String residenceFoodMenuId;

	private MealType mealType;

	private String vendorId;

	private String vendorName;

	private Integer vegPax;

	private Integer nonVegPax;

	@Builder.Default
	private Double vegCost = 0d;

	@Builder.Default
	private Double nonVegCost = 0d;

	private Integer stanzaStaffVegPax;

	private Integer stanzaStaffNonVegPax;

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

}
