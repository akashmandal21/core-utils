package com.stanzaliving.core.food.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class FoodItemCategoryFeedbackReasonCsvUploadDto {

	@JsonProperty("ItemCategoryName")
	private String itemCategoryName;

	@JsonProperty("FeedbackReason")
	private String feedbackReason;

}