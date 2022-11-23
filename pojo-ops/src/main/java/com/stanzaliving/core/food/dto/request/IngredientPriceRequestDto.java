package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.IngredientPriceLevel;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientPriceRequestDto {
	private IngredientPriceLevel priceLevel;
	private String cityId;
	private String vendorId;
}
