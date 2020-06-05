package com.stanzaliving.core.food.dto;

import java.util.List;

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
public class FoodOrderHistoryDto {
	
	private String meal;

	private Integer students;

	private Integer avgAttendance;

	private Integer vegOrder;

	private Integer nonVegOrder;
	
	private Integer sequence;

	private List<FoodOrderHistoryAdditionalItemDto> additionalItemDtos;

}
