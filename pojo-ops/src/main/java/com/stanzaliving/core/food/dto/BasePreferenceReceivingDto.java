package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.FoodItemType;

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
public class BasePreferenceReceivingDto {
	
	private String dispatchSummaryitemsId;
	
	private FoodItemType itemType;
	
	private Integer actual;
	
	@Builder.Default
	private Integer expected=0;

}
