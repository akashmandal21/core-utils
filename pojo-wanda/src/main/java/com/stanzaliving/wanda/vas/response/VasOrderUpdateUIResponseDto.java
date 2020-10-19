/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.vas.response;

import java.util.List;

import com.stanzaliving.core.food.enums.VasOrderStatus;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class VasOrderUpdateUIResponseDto {

	private String orderId;
	private VasOrderStatus orderStatus;
	private String orderStatusName;
	private MealType mealType;
	private String mealTypeName;
	private PriceUIDto prices;
	private List<ItemCostUIResponseDto> items;

}
