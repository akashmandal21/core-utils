package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 16-June-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryNameRequestDto {

	@NotNull(message = "City Selection is mandatory for name generation")
	private String cityId;
	
	private String microMarketId;

	private ResidenceBrand residenceBrand;
	
	private FoodServeType foodServeType;
	
	private FoodRegion foodRegion;
	
	private MenuType menuType;
	
	private String suffix;

	@Min(0)
	@Max(7)
	private int breakfastCount;

	@Min(0)
	@Max(7)
	private int lunchCount;

	@Min(0)
	@Max(7)
	private int dinnerCount;

	@Min(0)
	@Max(7)
	private int eveningSnacksCount;

	@Min(0)
	@Max(7)
	private int lunchTiffinCount;

	@Min(0)
	@Max(7)
	private int brunchCount;
}