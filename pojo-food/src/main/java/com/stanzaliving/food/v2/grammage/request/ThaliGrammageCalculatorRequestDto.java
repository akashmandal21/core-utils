package com.stanzaliving.food.v2.grammage.request;


import com.stanzaliving.core.food.enums.FoodServeType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Collection;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ThaliGrammageCalculatorRequestDto {
	private FoodServeType foodServeType;
	private Collection<String> itemIds;
	private boolean selected;
}
