package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
	
	private LocalDateTime receivedTime;
	
	private List<FoodOrderItemReceiveDto> foodOrderItemReceiveDtos;

}
