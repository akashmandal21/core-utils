package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 19-Oct-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemPricingUpdateRequestDto {
	@NotBlank(message = "Vas Item Selection is mandatory")
	private String ItemId;

	private Double finalPrice;
	
	private double marginPercent;

	private Boolean status;
}
