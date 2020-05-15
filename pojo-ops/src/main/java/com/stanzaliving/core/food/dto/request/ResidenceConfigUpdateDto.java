package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 14-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceConfigUpdateDto {

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	@NotNull(message = "Food Preference is mandatory")
	private FoodPreference foodPreference;

	@NotNull(message = "Food Region is mandatory")
	private FoodRegion foodRegion;

	@NotNull(message = "Residence Brand is mandatory")
	private ResidenceBrand residenceBrand;

	@NotNull(message = "Residence Gender is mandatory")
	private EstateGender gender;

}