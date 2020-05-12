package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.MenuItemDto;
import com.stanzaliving.core.food.dto.MenuItemStatDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


/**
 * @author piyush srivastava
 *
 * @date 12-May-2020
 *
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryWiseMealItems {

	private String categoryId;

	private String categoryName;

	private List<MenuItemDto> items;
}