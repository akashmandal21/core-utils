package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;

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
public class FoodOrderReceiveDto {

	private MealType meal;

	private LocalDate date;

	private Date receivedTime;

	private String orderId;
	
	private String residenceFoodMenuId;

	@NotEmpty(message = "item receiving can not be empty")
	private List<FoodOrderItemReceiveDto> foodOrderItemReceiveDtos;
	
	private List<FoodOrderReceivingAdditionalItemsDto> additionalItemsDtos;

}
