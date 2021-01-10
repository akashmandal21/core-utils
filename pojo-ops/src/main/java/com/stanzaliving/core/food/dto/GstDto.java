package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.co"
 *
 * @version 1.0
 *
 * @since 25-Sep-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GstDto {
	private Double cgst;

	private Double sgst;

	private Double igst;

	private Integer gstPercentage;
}
