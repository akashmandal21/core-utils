package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.*;
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

	private FoodItemType foodType;

	private Boolean eggPresent;

	private String categoryId;

	@NotNull(message = "Serve is mandatory. Possible values are in between 1 and 10")
	@Min(value = 1, message = "Serve can not be less than 1")
	@Max(value = 10, message = "Serve can not be greater than 10")
	private Integer serves;

	@NotNull(message = "Self life selection is mandatory")
	private Integer selfLife;

	@NotNull(message = "Proposed price is mandatory")
	private Integer proposedPrice;

	private UnitOfMeasurement unitOfMeasurement;

	private String imageId;

	private Boolean status;

	@Valid
	@NotEmpty(message = "Dish selection is mandatory")
	private List<VasMasterDishesRequestDto> dishes;

	@Valid
	@NotEmpty(message = "Packaging selection is mandatory")
	private List<VasMasterPackagingRequestDto> packaging;

	@Valid
	@NotNull(message = "Recipe selection is mandatory")
	private VasMasterRecipeRequestDto recipe;

	@NotEmpty(message = "Feedback options selection is mandatory")
	private List<String> feedbackOptions;

}
