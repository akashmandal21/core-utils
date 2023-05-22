package com.stanzaliving.food.v2.order.request;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek"
 *
 * @version 2.0
 *
 * @since 26-JAN-2023
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class NormalizeOrderResponseDto extends PaxCountRequestDto {

	private MealType mealType;

	private boolean changed;

	private List<MenuPaxCountRequestDto> menusPaxCount;

	private String residenceId;

	private LocalDate menuDate;

}
