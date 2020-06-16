package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


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
	private String cityId;
	private String microMarketId;

	private ResidenceBrand residenceBrand;
	private FoodServeType foodServeType;
	private FoodRegion foodRegion;

	@Min(0) @Max(7)
	private int breakfastCount;

	@Min(0) @Max(7)
	private int lunchCount;

	@Min(0) @Max(7)
	private int dinnerCount;

	@Min(0) @Max(7)
	private int eveningSnacksCount;

	@Min(0) @Max(7)
	private int lunchTiffinCount;

	@Min(0) @Max(7)
	private int brunchCount;
}
