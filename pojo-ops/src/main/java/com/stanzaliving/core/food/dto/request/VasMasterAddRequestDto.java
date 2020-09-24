package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 23-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMasterAddRequestDto {
	private String name;

	private String description;

	private FoodItemType itemType;

	private String categoryId;

	private Integer serves;

	private Integer selfLife;

	private Double proposedPrice;

	private UnitOfMeasurement unitOfMeasurement;

	private String imageId;

	private Boolean status;

	private List<VasMasterDishesRequestDto> dishes;

	private List<VasMasterPackagingRequestDto> packaging;

	private VasMasterRecipeRequestDto recipe;


}
