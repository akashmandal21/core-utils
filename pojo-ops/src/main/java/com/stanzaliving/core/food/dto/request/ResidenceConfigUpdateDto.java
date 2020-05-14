package com.stanzaliving.core.food.dto.request;


import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodPreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.user.enums.Gender;
import lombok.*;
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

	private String residenceId;

	private FoodPreference foodPreference;

	private FoodRegion foodRegion;

	private ResidenceBrand residenceBrand;

	private Gender gender;

}
