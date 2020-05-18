package com.stanzaliving.core.food.dto;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.TiffinOrderType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@ToString
public class TiffinOrderRequestDto {

	@NotNull(message = "Status is mandatory")
	private Boolean status;

	@NotNull(message = "Order Type is mandatory")
	private TiffinOrderType orderType;
}
