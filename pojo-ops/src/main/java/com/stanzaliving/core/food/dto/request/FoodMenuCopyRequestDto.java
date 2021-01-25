package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;

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
public class FoodMenuCopyRequestDto {

	@NotBlank(message = "Menu Group id is mandatory")
	private String menuGroupId;
	
	@NotBlank(message = "Source menu category is mandatory")
	private String sourceMenuCategory;

}