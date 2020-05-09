package com.stanzaliving.core.food.dto.request;

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
public class ResidentFoodItemFeedbackUpdateDto {

	@NotBlank(message = "ResidentFoodItemFeedbackUuid cannot be blank")
	private String residentFoodItemFeedbackUuid;

	@NotNull(message = "Rating cannot be null")
	private Float rating;

}
