package com.stanzaliving.core.food.dto.menuconsumption;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.dto.menufps.response.ResidenceFpsResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 28-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuMicromarketConsumptionDto extends MealsConsumptionResponseDto {

	private ListingDto micromarket;

	private List<ResidenceConsumptionResponseDto> residenceComsumption;

}
