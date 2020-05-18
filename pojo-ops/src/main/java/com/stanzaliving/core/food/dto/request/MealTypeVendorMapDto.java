package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush srivastava
 *
 * @date 13-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealTypeVendorMapDto {

	private MealType mealType;

	private List<VendorMappingDto> vendors;

}