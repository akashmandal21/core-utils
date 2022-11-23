package com.stanzaliving.food.v2.preference.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class UserMealPreferenceDto extends AbstractDto {
	private String userId;
	private String userName;
	private String residentCode;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<MealPreferenceDto> mealPreferences;
}
