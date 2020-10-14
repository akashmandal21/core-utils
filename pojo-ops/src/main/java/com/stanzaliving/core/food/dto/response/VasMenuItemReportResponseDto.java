package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.dto.PriceDto;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 13-Oct-2020
 *
 * @version 1.0
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMenuItemReportResponseDto {
	private String vasItemId;

	private String vasItemName;

	private List<String> accompaniments;

	private ListingDto category;

	private List<EnumListing<MealType>> applicableMeals;

	private Integer lastFourWeekSameDayOrderCount;

	private Integer lastOneWeekOrderCount;

	private Double marginPercent;

	private Double rating;

	private PriceDto priceDto;

}
