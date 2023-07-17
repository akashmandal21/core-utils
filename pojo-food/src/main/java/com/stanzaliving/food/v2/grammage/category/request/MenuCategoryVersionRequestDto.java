package com.stanzaliving.food.v2.grammage.category.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
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
public class MenuCategoryVersionRequestDto {
	@NotBlank(message = "Menu category version id is required")
	private String menuCategoryVersionId;
}
