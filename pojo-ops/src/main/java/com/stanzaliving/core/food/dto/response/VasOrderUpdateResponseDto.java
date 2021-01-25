package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.PriceDto;
import com.stanzaliving.core.food.enums.VasOrderStatus;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 18-Sep-2020
 */
@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class VasOrderUpdateResponseDto {

	private String orderId;

	private VasOrderStatus orderStatus;

	private String orderStatusName;

	private MealType mealType;

	private String mealTypeName;

	private PriceDto prices;

	private List<ItemCostResponseDto> items;

}