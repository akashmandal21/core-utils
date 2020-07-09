package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 08-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealTypeVendorDto {
	@NotBlank(message = "meal type is required")
	private MealType mealType;

	private String mealName;

	@NotBlank(message = "vendor Id is required")
	private String vendorId;

	private String vendorName;
}
