package com.stanzaliving.food.v2.grammage.category.request;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.food.v2.category.constant.MenuCategoryGrammageUpdateAction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
	
	@NotEmpty(message = "Menu category version id is required")
	private List<MenuCategoryVersionUpdateDto> menuCategoryVersionDtoList;
	
}
