package com.stanzaliving.core.food.dto.menufps.response;

import com.stanzaliving.core.food.dto.menufps.IdFpsConsumptionDto;
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
 * @since 29-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryFpsConsumptionResponseDto {
	private IdFpsConsumptionDto menuCategory;

	private List<ResidenceFpsConsumptionResponseDto> residences;
}
