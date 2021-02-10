package com.stanzaliving.search.food.search.dto.response.menu.consumption;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 28-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryConsumptionDto extends ConsumptionPercentageDto {
	private String menuCategoryId;
}
