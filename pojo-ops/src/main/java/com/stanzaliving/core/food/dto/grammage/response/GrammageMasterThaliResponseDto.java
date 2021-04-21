package com.stanzaliving.core.food.dto.grammage.response;

import com.stanzaliving.core.food.enums.ThaliOption;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 16-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class GrammageMasterThaliResponseDto {

	private EnumListing<ThaliOption> thali;

	private List<MealGrammageResponseDto> mealGrammages;
}
