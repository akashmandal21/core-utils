package com.stanzaliving.wanda.response;

import java.time.LocalDate;
import java.util.Set;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RecentMealFeedbackDto {
	
	private boolean isCafe;

	private String masterOrderId;

	private String foodOrderId;

	private String studentId;

	private Integer residenceId;

	private String residenceUuid;

	private LocalDate menuDate;

	private EnumListing<MealType> mealType;
	
	private String nudgeId;
	
	private String menuDateStr;
	
	private Set<String> items;
	
}
