package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 15-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasOrderAddRequestV2Dto {
	private String residenceId;

	private String userId;

	private LocalDate menuDate;

	private MealType mealType;

	@Valid
	@NotNull(message = "Vas items selection is mandatory")
	private List<VasOrderItemRequestDto> items;

}
