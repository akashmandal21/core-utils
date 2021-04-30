package com.stanzaliving.core.food.dto.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 21-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealGrammageResponseDto {

	private KeyValuePairDto mealType;

	private boolean enabled;

	private Integer grammage;
}
