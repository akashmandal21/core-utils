package com.stanzaliving.core.food.dto;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenFoodOrderRequestDto {

	@NotBlank(message = "Vendor Id Cannot be blank")
	private String vendorId;

	private LocalDate orderDate;

	@Valid
	private List<KitchenOrderMealRequestDto> meals;

}
