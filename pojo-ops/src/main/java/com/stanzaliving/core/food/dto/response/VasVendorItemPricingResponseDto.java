package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
/**
 * @author ashutosh.chandra "ashutoshchandra.retainer@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 29-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasVendorItemPricingResponseDto {

	private String vasMasterId;

	private String vasItemName;

	private List<String> accompaniments;

	private EnumListing<FoodItemType> foodType;

	private ListingDto category;

	private Double cost;

	private Double marginPercent;

	private Double sellPrice;

	private Double gst;

	private Double proposedPrice;

	private Double finalPrice;

	private boolean status;

}
