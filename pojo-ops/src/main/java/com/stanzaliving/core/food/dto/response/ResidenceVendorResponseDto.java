package com.stanzaliving.core.food.dto.response;


import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.user.enums.Gender;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 13-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceVendorResponseDto {
	private String residenceName;

	private ResidenceBrand residenceBrand;

	private Gender gender;

	private String micromarket;

	private String city;

	private String menuCategory;

	private Set<String> vendors;
}
