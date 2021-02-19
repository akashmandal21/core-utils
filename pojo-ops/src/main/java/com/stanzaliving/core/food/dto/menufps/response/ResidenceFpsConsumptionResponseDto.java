package com.stanzaliving.core.food.dto.menufps.response;

import com.stanzaliving.core.food.dto.menufps.IdFpsConsumptionDto;
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
 * @since 29-Jan-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceFpsConsumptionResponseDto extends IdFpsConsumptionDto {
	private boolean operational;

	private int mir;
}
