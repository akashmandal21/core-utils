package com.stanzaliving.search.food.index.dto.vasmaster;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.VasType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class VasMasterIndexDto extends AbstractSearchIndexDto {

	private String name;

	private String nameSuggest;

	private String nameKeyword;

	private FoodItemType foodType;

	private VasType vasType;

	private Boolean eggPresent;

	private String categoryId;

	private String description;

	private Double shelfLife;

	private Integer serves;

	private Double proposedPrice;

	private String imageId;

	private UnitOfMeasurement unitOfMeasurement;

	private Double grammagePerPax;

	private String dishId;

	private boolean dataComplete;

	private List<String> feedbackOptions;

	private List<VasMasterDishIndexDto> dishes;
}
