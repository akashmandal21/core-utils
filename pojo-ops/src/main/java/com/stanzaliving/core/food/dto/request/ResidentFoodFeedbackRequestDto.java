package com.stanzaliving.core.food.dto.request;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.operations.enums.FeedbackSource;
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
public class ResidentFoodFeedbackRequestDto {

	@NotBlank(message = "FoodOrderId cannot be blank")
	private String foodOrderId;

	@NotBlank(message = "User is not valid")
	private String userId;

	@NotNull(message = "Rating is mandatory")
	private Float rating;

	private String comment;

	private List<ResidentFoodItemFeedbackRequestDto> itemFeedbackRequestDtos;

	private String nudgeId;

	private FeedbackSource source;

	private Set<String> mealFeedbackOptionUuids;
	
	private String notificationId;

	private boolean partial;
}