package com.stanzaliving.food.v2.grammage.category.request;

import com.stanzaliving.food.v2.category.constant.MenuCategoryGrammageUpdateAction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Manish.PAreek
 *
 * @since 14-Jun-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryVersionUpdateDto {
	@NotBlank(message = "Menu category version id is required")
	private String menuCategoryVersionId;

	@NotNull(message = "Action is required")
	private MenuCategoryGrammageUpdateAction action;
	
}
