package com.stanzaliving.search.food.index.dto.menu;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 11-Jan-2021
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryItemOrderCountIndexDto extends AbstractSearchIndexDto {

	private String menuCategoryId;

	private String itemId;

	private LocalDate orderDate;

	private Integer orderedCount;
}
