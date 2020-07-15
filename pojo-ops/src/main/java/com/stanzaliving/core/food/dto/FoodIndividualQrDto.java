package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.food.dto.response.FoodItemTypeWiseMealCount;
import com.stanzaliving.core.food.enums.DispatchSummaryItemType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodIndividualQrDto {
	
	private String itemName;
	
	private String itemLabelName;
	
	private String mealType;
	
	private String contextId;
	
	private String subContextId;

	private List<FoodItemTypeWiseMealCount> itemTypeWiseMealCounts;

	private DispatchSummaryItemType contextType;
	
	private int itemQuantity;
	
	private Object itemData;
	
	private int numberOfContainers;
	
	private int vasItems;
	
	private int numberOfVasItemsRecieved;
	
	private LocalDate menuDate;
	
	private String residenceFoodMenuId;
	
	private int numberOfMealsReceived;
	
	private int numberOfContainersReceived;
}
