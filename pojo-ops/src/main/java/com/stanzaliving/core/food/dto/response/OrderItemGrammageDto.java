package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 04-Aug-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemGrammageDto {

	private String itemId;

	private String itemName;

	private FoodItemType itemType;

	@Builder.Default
	private Integer orderedQty = 0;

	@Builder.Default
	private Double orderedWeight = 0d;

	@Builder.Default
	private boolean isApplicableToNonSl = false;

	private String categoryId;

}
