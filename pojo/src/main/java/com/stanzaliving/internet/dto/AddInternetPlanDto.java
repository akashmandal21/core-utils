package com.stanzaliving.internet.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.enums.DataUnit;
import com.stanzaliving.internet.enums.InternetVendor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddInternetPlanDto {

	@NotNull(message = "Vendor is mandatory for plan")
	private InternetVendor vendor;

	@NotBlank(message = "Plan Name is mandatory")
	private String planName;

	@NotNull(message = "Plan data is mandatory")
	@Min(value = 1, message = "Data value cannot be less than 1")
	private Integer data;

	@NotNull(message = "Data Unit is mandatory for plan")
	private DataUnit dataUnit;

	@NotNull(message = "Data Speed is mandatory for plan")
	@Min(value = 1, message = "Data speed value cannot be less than 1")
	private Integer speed;

	@NotNull(message = "Data Speed Unit is mandatory for plan")
	private DataUnit speedUnit;

	@NotNull(message = "Plan Validity is mandatory")
	@Min(value = 1, message = "Plan validity cannot be less than 1")
	private Integer validity;

	private Double basePrice;

	private Double tax;

	private Double totalPrice;

	private int userMGPercent;

}