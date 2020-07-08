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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SwitchResidenceFoodMenuVendorDto {
	private String residenceId;

	private String residenceName;

	private String cityId;

	private String cityName;

	private String menuCategoryId;

	private String menuCategoryName;

	private Set<String> currentVendors;

	private String residenceBrand;

	private String gender;
}
