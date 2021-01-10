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
public class ItemRatingRequestDto {
	
	@NotBlank(message = "Item Id Cannot be blank")
	private String itemId;
	
	@NotNull(message = "Item Cost Cannot be null")
	private Double itemCost;
	
	private Float rating;

}
