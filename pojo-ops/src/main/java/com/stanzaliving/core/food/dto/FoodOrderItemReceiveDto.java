package com.stanzaliving.core.food.dto;

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
public class FoodOrderItemReceiveDto {

	private String name;

	@Builder.Default
	private Integer quantity=null;

	@Builder.Default
	private Double weight=null;

	private boolean isLatelyAdded;

}
