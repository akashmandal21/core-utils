package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava
 *
 * @date 10-June-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategorySummaryDto {
	private Integer total;

	private Integer published;

	private Integer pending;

	private CountNameListDto city;

	private CountNameListDto micromarket;

	private long hostels;
}
