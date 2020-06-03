package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

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
public class FoodOrderAdditionalItemsRequestDto {
	
	@NotBlank(message = "Order Id Cannot be blank")
	private String orderId;
	
	@NotEmpty(message = "Additional items cannot be empty")
	private List<AdditionalItemsRequestDto> additionalItemsRequestDtos;

}
