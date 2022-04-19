package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingCommercialsRequestDto implements Serializable {

	@Min(value = 1, message = "license fee cannot be negative or zero")
	private Double licenseFee;

	@Builder.Default
	private Double cityHeadBuffer = 0.0;

	@Builder.Default
	private Double upsell = 0.0;

	@Builder.Default
	private Double priceBump = 0.0;

	@Valid
	private ServicePriceDto packagedServicePriceDto;

	@Valid
	private ServicePriceDto foodServicePriceDto;

	@Valid
	private ServicePriceDto vasPriceDto;

}
