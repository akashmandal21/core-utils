package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentFoodItemFeedbackDto {

	private String residentFoodItemFeedbackId;

	private String itemId;

	private String item;

	private String categoryId;

	private String subCategoryId;

	private FoodItemType foodPreference;

	private boolean quantifiable;
	
	private Integer quantiity;

	private Integer weight;

	private UnitOfMeasurement unit;

	private String unitName;

	private Float rating;

	private String reason;

	private String comment;

	private List<ExpectedItemFeedbackReasonDto> expectedItemFeedbackReasons;

}