package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 07-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ItemPriceDto {
	private Double cost;

	private Double gst;

	private Double price;
}
