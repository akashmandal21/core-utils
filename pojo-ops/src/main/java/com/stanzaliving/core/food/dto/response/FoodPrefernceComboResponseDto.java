package com.stanzaliving.core.food.dto.response;

import java.util.List;

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
public class FoodPrefernceComboResponseDto {
	
	@Builder.Default
	private boolean selected=false;
	
	private String preferenceName;
	
	private List<FoodPreferenceComboItemDto> comboItemDtos;

}
