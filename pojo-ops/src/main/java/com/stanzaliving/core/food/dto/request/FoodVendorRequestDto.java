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
public class FoodVendorRequestDto {

	@NotBlank(message = "name Cannot be blank")
	private String name;

	private String cityId;

	@NotBlank(message = "contactName Cannot be blank")
	private String contactName;

	@NotBlank(message = "contactNumber Cannot be blank")
	private String contactNumber;

	@NotBlank(message = "contactEmail Cannot be blank")
	private String contactEmail;

	private boolean stanzaKitchen;

}
