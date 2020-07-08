package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class MealVendorsQueryDto {
	private MealType mealType;

	private List<String> vendorIds;
}
