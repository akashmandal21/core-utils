package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
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
	@NotNull(message = "Menu date is required")
	private LocalDate menuDate;

	private boolean changeVendorAllowed;

	@NotEmpty(message = "Meal vendors are missing")
	@Valid
	private List<MealTypeVendorDto> mealVendors;

}
