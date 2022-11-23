package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.food.enums.FoodServeType;

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
public class DateActiveMealDto {

	private LocalDate date;

	@Builder.Default
	private FoodServeType serveType = FoodServeType.PACKAGED;

	private String serveTypeName;
	
	private List<ActiveMealDto> activeMealDtos;

}
