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
public class ResidentFoodItemFeedbackUpdateDto {

	@NotBlank(message = "ResidentFoodItemFeedbackId cannot be blank")
	private String residentFoodItemFeedbackId;

	@NotNull(message = "Rating cannot be null")
	private Float rating;
	
	private List<ExpectedItemFeedbackReasonDto> expectedItemFeedbackReasons;

}
