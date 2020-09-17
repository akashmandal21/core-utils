package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 16-Sep-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasOrderAddRequestDto {
	@NotBlank(message = "Residence id is mandatory")
	private String residenceId;

	@NotBlank(message = "User id is mandatory")
	private String userId;

	@NotNull(message = "Menu date is mandatory.")
	private LocalDate menuDate;

	@NotNull(message = "Please specify meal type.")
	private MealType mealType;

	@Valid
	@NotNull(message = "Vas items selection is mandatory")
	private List<ItemQuantityRequestDto> items;
}
