package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.operations.enums.MealType;

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

	@NotBlank(message = "ResidenceFoodMenuId cannot be blank")
	private String residenceFoodMenuId;

	@NotNull(message = "MenuDate cannot be null")
	private LocalDate menuDate;

	@NotNull(message = "MealTyoe cannot be null")
	private MealType mealType;

	@NotBlank(message = "UserId cannot be blank")
	private String userId;

	@NotBlank(message = "VendorId cannot be blank")
	private String vendorId;

	@NotNull(message = "Rating cannot be null")
	private Float rating;

	private String reason;

	private String comment;

	private List<ResidentFoodItemFeedbackRequestDto> itemFeedbackRequestDtos;

}
