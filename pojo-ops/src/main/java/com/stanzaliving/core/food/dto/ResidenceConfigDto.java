/**
 * 
 */
package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.estate.enums.EstateGender;
import com.stanzaliving.core.food.enums.FoodPreference;
import com.stanzaliving.core.food.enums.FoodRegion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 23-Apr-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceConfigDto {

	private String residenceId;

	private String residenceName;

	private String microMarketId;

	private String microMarketName;

	private String menuCategoryId;
	
	private String menuCategoryName;

	private ResidenceBrand residenceBrand;

	private FoodRegion foodRegion;

	private FoodPreference foodPreference;

	private EstateGender gender;
}