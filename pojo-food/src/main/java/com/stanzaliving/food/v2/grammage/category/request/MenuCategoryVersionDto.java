package com.stanzaliving.food.v2.grammage.category.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodServeType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
/**
 * @author manish.pareek
 *
 * @since 20-Jul-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryVersionDto extends AbstractDto {
	private static final long serialVersionUID = -8876472628307942788L;
	private String categoryId;
	private FoodServeType foodServeType;
}
