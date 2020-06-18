package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;

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
public class UserResidenceFoodMenuRequestDto {
	
	@NotBlank(message = "User Id Cannot be blank")
	private String userId;
	
	@NotBlank(message = "Residence Food Menu Id Cannot be blank")
	private String residenceFoodMenuId;
	
	private String userResidenceFoodMenuId;
	
	@NotBlank(message = "MealName Cannot be blank")
	private String mealName;
	
	@NotNull(message = "Date Cannot be null")
	private LocalDate date;
	
	@NotBlank(message = "Base Preference Cannot be blank")
	private String itemBasePreference;
	
	@NotBlank(message = "Food Region Cannot be blank")
	private String foodRegion;

}
