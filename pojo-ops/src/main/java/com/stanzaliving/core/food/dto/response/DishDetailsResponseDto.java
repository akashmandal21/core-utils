package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
public class DishDetailsResponseDto {

	private String dishId;

	private String dishName;

	private EnumListing foodType;

	private boolean quantifiable;

	private EnumListing unit;

	private Integer grammageAmount;

	private Double grammageQuantity;

	private boolean accompaniment;

}
