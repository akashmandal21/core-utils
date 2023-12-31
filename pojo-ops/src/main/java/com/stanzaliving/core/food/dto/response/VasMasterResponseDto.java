package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.dto.DishRecipeDetailsDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.VasType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.sivastava@stanzaliving.com"
 *
 * @since 26-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMasterResponseDto {
	private String vasMasterId;

	private boolean status;

	private String name;

	private String description;

	private EnumListing<FoodItemType> foodType;

	private EnumListing<VasType> vasType;

	private Boolean eggPresent;

	private ListingDto category;

	private Integer serves;

	private Double shelfLife;

	private Double proposedPrice;

	private EnumListing<UnitOfMeasurement> unitOfMeasurement;

	private Double grammagePerPax;

	private String imageUrl;

	private List<DishDetailsResponseDto> dish;

	private List<VasMasterPackagingResponseDto> packaging;

	private List<ListingDto> feedback;
}
