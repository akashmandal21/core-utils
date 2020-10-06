package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 05-Oct-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMenuAddRequestDto {
	@NotBlank(message = "Vendor Id is mandatory")
	private String vendorId;

	@NotNull(message = "Menu Date is mandatory")
	private LocalDate menuDate;

	@NotNull(message = "Meal type selection is mandatory")
	private MealType mealType;

	private List<VasMenuItemRequestDto> items;
}
