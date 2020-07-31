package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.dto.ExpectedItemFeedbackReasonDto;

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
public class ResidentFoodItemFeedbackRequestDto {

	private String residentFoodFeedbackId;

	@NotBlank(message = "ItemId cannot be blank")
	private String itemId;

	@NotNull(message = "Rating cannot be null")
	private Float rating;

	private String reason;

	private String comment;

	private List<ExpectedItemFeedbackReasonDto> expectedItemFeedbackReasons;

}