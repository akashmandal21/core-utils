package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

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
	
	private String contextId;
	
	private String subContextId;

	private DispatchSummaryItemType contextType;
	
	private int itemQuantity;
	
	private Object itemData;
	
	private int numberOfContainers;
	
	private int vasItems;
	
	private LocalDate menuDate;
	
	private String residenceFoodMenuId;
	
}
