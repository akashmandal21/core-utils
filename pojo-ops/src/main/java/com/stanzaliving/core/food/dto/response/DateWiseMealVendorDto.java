package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
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
public class DateWiseMealVendorDto {
	@NotNull(message = "menu date is required")
	private LocalDate menuDate;

	private boolean changeVendorAllowed;

	@NotNull(message = "meal vendors for date can not be null")
	private List<MealTypeVendorDto> mealVendors;

}
