package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 13-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GrammageMasterBaseResponseDto {

	private KeyValuePairDto category;

	private KeyValuePairDto subCategory;

	private List<MealThaliTypeResponseDto<Integer>> mealGrammages;

	private DraftResponseDto<Boolean> additive;

	private DraftResponseDto<Boolean> override;

}
