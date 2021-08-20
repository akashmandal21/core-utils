package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 26-May-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuGrammage {

	public static final long serialVersionUID = 2323232L;

	private KeyValuePairDto residence;

	private LocalDate weekStartDate;

	private LocalDate weekEndDate;

	private List<MealMenuGrammageDto> mealMenus;

}
