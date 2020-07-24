package com.stanzaliving.core.food.dto.response;

import java.util.List;

import com.stanzaliving.core.food.dto.ResidenceConfigDto;
import com.stanzaliving.core.food.dto.request.MealTypeVendorMapDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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

	private List<MealTypeVendorMapDto> availableVendors;
}