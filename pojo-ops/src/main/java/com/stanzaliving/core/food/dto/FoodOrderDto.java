package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderDto extends AbstractDto {

	private Long id;

	private String groupOrderId;

	private String residenceFoodMenuId;

	private String residenceId;

	private LocalDate menuDate;

	private MealType mealType;

	private String vendorId;

	private Integer vegPax;

	private Integer nonVegPax;

	private Double vegCost;

	private Double nonVegCost;

	private Integer stanzaStaffVegPax;

	private Integer stanzaStaffNonVegPax;

	private Double stanzaStaffVegCost;

	private Double stanzaStaffNonVegCost;

	private Integer nonStanzaStaffVegPax;

	private Integer nonStanzaStaffNonVegPax;

	private Double nonStanzaStaffVegCost;

	private Double nonStanzaStaffNonVegCost;

	private Double additionalItemsCost;

	private Double totalCost;

}
