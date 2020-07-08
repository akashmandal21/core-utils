package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 08-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DateWiseMealVendorDto {
	private LocalDate menuDate;

	private String breakfastVendor;

	private String lunchVendor;

	private String eveningSnacksVendor;

	private String dinnerVendor;
}
