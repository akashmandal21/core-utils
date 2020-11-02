package com.stanzaliving.core.cafe.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
public class CafeItemPricingUpdateResponseDto {
	
private String itemId;

private String itemName;

private Double gst;

private Double gstPercent;

private Double masterPriceInclGst;

private Double masterPriceExclGst;

private Double margin;

private List<CogsPriceDto> cogs;

private List<String> accompaniments;

private EnumListing<FoodItemType> foodType;

private ListingDto category;

private String description;

private String packaging;

private boolean itemEnableStatus;

private List<ResidenceItemPricingUpdateRequestDto> residenceItemPricingList;

}	
