package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class VasMasterDishesRequestDto {

	@NotBlank(message = "Dish selection is mandatory")
	private String dishId;

	@NotBlank(message = "Dish selection is mandatory")
	private String dishName;

	@NotNull(message = "Accompaniment selection is mandatory")
	private Boolean accompaniment;

	@NotNull(message = "Grammage is mandatory for dishes")
	private Double grammageAmount;

	private Double grammageQuantity;

}
