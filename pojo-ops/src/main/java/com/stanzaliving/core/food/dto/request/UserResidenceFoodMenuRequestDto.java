package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
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
public class UserResidenceFoodMenuRequestDto {
	
	@NotBlank(message = "User Id Cannot be blank")
	private String userId;
	
	@NotBlank(message = "Residence Food Menu Id Cannot be blank")
	private String residenceFoodMenuId;
	
	private String userResidenceFoodMenuId;
	
	private MealType meal;
	
	@NotNull(message = "Date Cannot be null")
	private LocalDate date;
	
	private FoodItemBasePreference itemBasePreference;
	
	private FoodRegion foodRegion;

}
