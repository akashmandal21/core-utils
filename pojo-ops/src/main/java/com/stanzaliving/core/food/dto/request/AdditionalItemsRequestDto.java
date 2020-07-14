package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class AdditionalItemsRequestDto {

	@NotBlank(message = "Item Id Cannot be blank")
	private String itemId;

	@NotBlank(message = "Item Name cannot be blank")
	private String itemName;

	private Integer pax;

	private Float rating;

	@Builder.Default
	private Integer stdQty = 0;

	@Builder.Default
	private Integer stdWeight = 0;

	private FoodItemType itemType;

}