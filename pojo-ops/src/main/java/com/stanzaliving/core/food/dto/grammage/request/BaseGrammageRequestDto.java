package com.stanzaliving.core.food.dto.grammage.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

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
public class BaseGrammageRequestDto {

	@NotBlank(message = "SubCategory selection is mandatory")
	private String subCategoryId;

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
