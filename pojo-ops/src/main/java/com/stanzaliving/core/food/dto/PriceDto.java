package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.co"
 *
 * @version 1.0
 *
 * @since 12-Sep-2020
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PriceDto extends GstDto {
	private Double subTotal;

	private Double totalTax;

	private Double grantTotal;
}
