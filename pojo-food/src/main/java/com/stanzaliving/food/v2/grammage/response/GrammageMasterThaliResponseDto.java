package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
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

	private KeyValuePairDto thali;

	private boolean status;

	private List<MealGrammageResponseDto> mealGrammages;
}
