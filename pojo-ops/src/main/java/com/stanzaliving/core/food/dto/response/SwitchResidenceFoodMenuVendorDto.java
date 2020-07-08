package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Set;

/**
 * @author piyush srivastava
 *
 * @date 08-July-2020
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SwitchResidenceFoodMenuVendorDto extends ResidenceVendorResponseDto {
	private List<DateWiseMealVendorDto> mealVendors;
}
