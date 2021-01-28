package com.stanzaliving.search.food.search.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.VasType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 22-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMasterSearchDto extends AbstractDto {

	private static final long serialVersionUID = 9788282989L;

	private String name;

	private FoodItemType foodType;

	private VasType vasType;

	private Boolean eggPresent;

	private String categoryId;

	//Search for addon items
	private String dishId;

	private Boolean dataComplete;

	private PageAndSortDto pageDto;
}
