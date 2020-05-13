package com.stanzaliving.core.food.dto.request;

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
public class MicroMarketVendorRequestDto {

	@NotBlank(message = "micromarketId Cannot be blank")
	private String micromarketId;

	private MealType mealType;

	@NotBlank(message = "vendorId Cannot be blank")
	private String vendorId;

	@NotNull(message = "primary boolean cannot be null")
	private Boolean primary;

}
