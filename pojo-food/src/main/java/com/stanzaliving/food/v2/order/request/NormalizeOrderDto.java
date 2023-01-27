package com.stanzaliving.food.v2.order.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 02-Aug-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class NormalizeOrderDto extends PaxCountRequestDto {

	private MealType mealType;

	private boolean changed;

	@Builder.Default
	private boolean totalPaxChanged = false;

	private List<MenuPaxCountRequestDto> menusPaxCount;


}
