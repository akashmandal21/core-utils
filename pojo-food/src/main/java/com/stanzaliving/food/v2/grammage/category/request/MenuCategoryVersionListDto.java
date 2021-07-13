package com.stanzaliving.food.v2.grammage.category.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author manish.pareek"
 *
 * @since 16-Jun-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryVersionListDto {

	@Valid
	@NotEmpty(message = "Menu category selection is required")
	private List<MenuCategoryVersionUpdateDto> menuCategoryVersionDtoList;
	
}
