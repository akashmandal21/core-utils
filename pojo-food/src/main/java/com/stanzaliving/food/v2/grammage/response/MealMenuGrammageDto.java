package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 05-Jun-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealMenuGrammageDto {

	private EnumListing<MealType> meal;

	private List<DayMenuGrammage> dayMenus;

}
