package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class ResidentFoodFeedbackUpdateDto {

	@NotBlank(message = "ResidentFoodFeedbackId cannot be blank")
	private String residentFoodFeedbackId;

	@NotNull(message = "Rating cannot be null")
	private Float rating;

	private List<ResidentFoodItemFeedbackUpdateDto> residentFoodItemFeedbackUpdateDtos;

}
