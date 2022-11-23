package com.stanzaliving.food.v2.preference.dto;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.food.v2.common.constant.SortingType;
import com.stanzaliving.food.v2.preference.constants.UserPreferenceSortingField;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class UserPreferenceSearchPDto implements Serializable {
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate orderDate;
	private String residenceId;
	private String dealId;
	private MealType mealType;
	private String searchText;
	private String thaliId;
	private Boolean systemGenerated;
	private SortingType sortingType;
	private UserPreferenceSortingField sortingField;
}
