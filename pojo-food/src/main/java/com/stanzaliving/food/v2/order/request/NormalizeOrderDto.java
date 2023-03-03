package com.stanzaliving.food.v2.order.request;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 02-Aug-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class NormalizeOrderDto extends PaxCountRequestDto {

	private MealType mealType;

	private boolean changed;

	private List<MenuPaxCountRequestDto> menusPaxCount;

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	@NotNull(message = "Food Order Date is mandatory")
	private LocalDate menuDate;



}
