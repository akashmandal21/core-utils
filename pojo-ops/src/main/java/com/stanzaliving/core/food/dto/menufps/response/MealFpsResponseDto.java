package com.stanzaliving.core.food.dto.menufps.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.dto.menufps.FpsDto;
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
 * @since 24-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealFpsResponseDto {

	private ListingDto meal;

	private FpsDto fps;
}
