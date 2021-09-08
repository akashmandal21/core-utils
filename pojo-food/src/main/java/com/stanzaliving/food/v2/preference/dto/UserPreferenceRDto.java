package com.stanzaliving.food.v2.preference.dto;

import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.DealType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class UserPreferenceRDto implements Serializable {
	private String userId;
	private String userCode;
	private String userName;
	private String thaliId;
	private String thaliName;
	private boolean systemGenerated;
	private boolean submitted;
	private boolean skipped;
	private FoodItemType itemType;
}
