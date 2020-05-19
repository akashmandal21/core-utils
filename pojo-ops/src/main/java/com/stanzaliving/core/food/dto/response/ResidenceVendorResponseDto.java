package com.stanzaliving.core.food.dto.response;

import java.util.Set;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.estate.enums.EstateGender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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

	private String residenceId;

	private String residenceName;

	private ResidenceBrand residenceBrand;

	private EstateGender gender;

	private String microMarketId;

	private String micromarket;

	private String cityId;

	private String city;

	private String menuCategoryId;

	private String menuCategory;

	private Set<String> vendors;
}