package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.dto.DishRecipeDetailsDto;
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

	private String name;

	private String description;

	private EnumListing foodType;

	private ListingDto category;

	private Integer serves;

	private Integer shelfLife;

	private Double proposedPrice;

	private List<DishDetailsResponseDto> dish;

	private DishRecipeDetailsDto recipe;
}
