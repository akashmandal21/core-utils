package com.stanzaliving.wanda.food.response;

import java.util.List;

import com.stanzaliving.core.food.enums.FoodOrderType;
import com.stanzaliving.core.food.enums.PackageCollectionStatus;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.wanda.response.FoodCardDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderHistoryDto {

	private List<FoodCardDto> foodCardDtos;
	
	private Double price;
	
	private PackageCollectionStatus packageCollectionStatus;
	
	private String packageCollectionStatusStr;
	
	private boolean rated;
	
	private Integer rating;

	private FoodOrderType foodOrderType;
	
	private String foodOrderTypeStr;
	
	private MealType mealType;
	
	private String mealTypeStr;
	
	private boolean showScan;
	
	private String userResidenceFoodMenuId;
	
	private String menuDate;
	
	private boolean editable;
	
}
