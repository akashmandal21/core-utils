package com.stanzaliving.core.food.dto.response;

import java.util.List;

import com.stanzaliving.core.food.dto.MenuItemDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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