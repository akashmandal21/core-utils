package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PriceListingDto extends ListingDto {
	private Double price;
	private Double cost;
	private Double quantity;

	private Double totalQuantity;
	private Double totalCost;
	private boolean missingPrice;
}
