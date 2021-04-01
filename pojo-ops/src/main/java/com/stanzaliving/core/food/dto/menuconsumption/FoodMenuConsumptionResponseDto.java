package com.stanzaliving.core.food.dto.menuconsumption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 28-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuConsumptionResponseDto implements Serializable {

	private static final long serialVersionUID = 7264514152736273L;

	private String menuGroupId;

	private FoodMenuMicromarketConsumptionDto micromarketConsumption;

	private String dateRange;
}
