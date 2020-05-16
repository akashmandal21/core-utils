package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.ResidenceConfigDto;
import com.stanzaliving.core.food.dto.request.MealTypeVendorMapDto;
import com.stanzaliving.core.food.dto.request.ResidenceVendorMapDto;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 15-May-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMealWiseVendorDto extends ResidenceConfigDto {
	private List<MealTypeVendorMapDto> mealVendors;
}
