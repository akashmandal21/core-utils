package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.dto.response.DateWiseMealVendorDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 08-July-2020
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MapResidenceMealVendorDto {
	private String residenceId;

	private List<DateWiseMealVendorDto> mealVendors;

}
