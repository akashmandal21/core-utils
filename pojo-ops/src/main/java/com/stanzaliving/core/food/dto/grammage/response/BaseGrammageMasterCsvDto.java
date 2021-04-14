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
 * @since 14-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseGrammageMasterCsvDto {

	private String subCategoryId;

	private String category;

	private String subCategory;

	private Integer breakfast;

	private Integer lunch;

	private Integer eveningSnacks;

	private Integer dinner;

	private Integer breakfastCombo;

	private Integer lunchCombo;

	private Integer eveningSnacksCombo;

	private Integer dinnerCombo;

	private Boolean additive;

	private Boolean override;
}
