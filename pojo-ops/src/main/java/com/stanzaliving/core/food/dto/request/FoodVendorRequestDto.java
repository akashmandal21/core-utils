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

	@NotBlank(message = "Vendor Name Cannot be blank")
	private String name;

	@NotBlank(message = "Vendor City Cannot be blank")
	private String cityId;

	@NotBlank(message = "Contact Name Cannot be blank")
	private String contactName;

	@NotBlank(message = "Contact Number Cannot be blank")
	private String contactNumber;

	@NotBlank(message = "Contact Email Cannot be blank")
	private String contactEmail;

	private boolean stanzaKitchen;

}