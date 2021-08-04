package com.stanzaliving.core.food.dto.request;

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

	private boolean additive;

	@Builder.Default
	private Integer stdQty = 0;

	@Builder.Default
	private Integer stdWeight = 0;

	private FoodItemType itemType;
}
