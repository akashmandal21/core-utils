package com.stanzaliving.core.food.dto.response;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 04-Sep-2020
 */


@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NextVasMealResponseDto extends NextApplicableMealDto {

	private long nextMealItemsCount;

	private List<ItemCostResponseDto> items;

}
