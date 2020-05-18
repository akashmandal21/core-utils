package com.stanzaliving.core.food.dto;

import java.util.List;

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

	private String residentFoodFeedbackId;

	private String itemId;

	private String item;

	private Float rating;

	private String reason;

	private String comment;

	private List<String> expectedItemFeedback;

}