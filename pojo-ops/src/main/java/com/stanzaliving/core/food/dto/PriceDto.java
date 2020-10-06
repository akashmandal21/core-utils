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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PriceDto {
	private Double subTotal;

	private Double sgst;

	private Double cgst;

	private Double igst;

	private Double totalTax;

	private Double grantTotal;
}
