package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.DishRecipeDetailsDto;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author piyush.srivastava "piyush.sivastava@stanzaliving.com"
 *
 * @since 26-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DishDetailsResponseDto implements Serializable {

	private String dishId;

	private String dishName;

	private EnumListing foodType;

	private boolean quantifiable;

	private EnumListing unit;

	private Double grammageAmount;

	private Double grammageQuantity;

	private boolean accompaniment;

	private DishRecipeDetailsDto recipe;


}
