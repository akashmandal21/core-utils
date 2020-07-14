package com.stanzaliving.core.food.dto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class DispatchListingDto {

	private String residenceName;

	private String residenceId;
	
	private MealType mealType;
	
	private String mealTypeStr;
	
	private LocalTime mealDispatchTime;
	
	private LocalTime mealStartTime;
	
	@Builder.Default
	private int vegMeals=0;
	
	@Builder.Default
	private int nonVegMeals=0;
	
	@Builder.Default
	private int staffMeals=0;
	
	@Builder.Default
	private int vasVegMeals=0;
	
	@Builder.Default
	private int vasNonVegMeals=0;
	
	private boolean printable;
	
	private String residenceMenuUuid;
	
	private String dispatchListUuid;
	
	@Builder.Default
	private List<String> dispatchSummaryIds=new ArrayList<>();
	
	
}
