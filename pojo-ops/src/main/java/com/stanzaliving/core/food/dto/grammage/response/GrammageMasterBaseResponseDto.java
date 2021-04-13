package com.stanzaliving.core.food.dto.grammage.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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

	private String subCategoryId;

	private DraftResponseDto<Integer> breakfast;

	private DraftResponseDto<Integer> lunch;

	private DraftResponseDto<Integer> eveningSnacks;

	private DraftResponseDto<Integer> dinner;

	private DraftResponseDto<Integer> breakfastCombo;

	private DraftResponseDto<Integer> lunchCombo;

	private DraftResponseDto<Integer> eveningSnacksCombo;

	private DraftResponseDto<Integer> dinnerCombo;

	private DraftResponseDto<Boolean> additive;

	private DraftResponseDto<Boolean> override;

}
