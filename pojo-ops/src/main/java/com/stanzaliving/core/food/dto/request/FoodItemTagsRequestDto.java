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
public class FoodItemTagsRequestDto {

	@NotBlank(message = "Tag Id Cannot be blank")
	private String tagId;

	@NotBlank(message = "Item Id Cannot be blank")
	private String itemId;

}
