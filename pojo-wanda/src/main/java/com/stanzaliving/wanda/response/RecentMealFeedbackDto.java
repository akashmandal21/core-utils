package com.stanzaliving.wanda.response;

import java.time.LocalDate;

import com.stanzaliving.core.operations.enums.MealType;

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
    private String orderType;
	private String studentId;
	private String orderTypeName;
	private Integer residenceId;
	private String mealTypeName;
	private String residenceUuid;
	private String userId;
	private LocalDate mealStartTime;
	private String menuDate;
	private MealType mealType;
	private String mealEndTime;
	private String nudgeId;
	private String collectionStatus;
	private String collectionStatusName;
	private String userResidenceFoodMenuId;
	private String prices;
	private String foodPreference;
	private String orderRating;
	private boolean collectionAllowed;
	private boolean changePreferenceAllowed;
	private String items;
	
}
