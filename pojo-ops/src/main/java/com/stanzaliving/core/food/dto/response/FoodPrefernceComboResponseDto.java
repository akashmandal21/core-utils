package com.stanzaliving.core.food.dto.response;

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
public class FoodPrefernceComboResponseDto {
	
	private boolean selected;
	
	private String preferenceName;
	
	private List<FoodPreferenceComboItemDto> comboItemDtos;

}
